package module3.string.regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту
 */
public class T1ParseText {
    public static void main(String[] args) throws IOException {
        String text = "Мистер и миссис Дурсль проживали в доме номер четыре по Тисовой улице и всегда с гордостью заявляли, что они, слава богу, абсолютно нормальные люди. Уж от кого-кого, а от них никак нельзя было ожидать, чтобы они попали в какую-нибудь странную или загадочную ситуацию. Мистер и миссис Дурсль весьма неодобрительно относились к любым странностям, загадкам и прочей ерунде.\n" +
                "\n" +
                "Мистер Дурсль возглавлял фирму под названием «Граннингс», которая специализировалась на производстве дрелей. Это был полный мужчина с очень пышными усами и очень короткой шеей. Что же касается миссис Дурсль, она была тощей блондинкой с шеей почти вдвое длиннее, чем положено при ее росте. Однако этот недостаток пришелся ей весьма кстати, поскольку большую часть времени миссис Дурсль следила за соседями и подслушивала их разговоры. А с такой шеей, как у нее, было очень удобно заглядывать за чужие заборы. У мистера и миссис Дурсль был маленький сын по имени Дадли, и, по их мнению, он был самым чудесным ребенком на свете.\n" +
                "\n" +
                "Семья Дурслей имела все, чего только можно пожелать. Но был у них и один секрет. Причем больше всего на свете они боялись, что кто-нибудь о нем узнает. Дурсли даже представить себе не могли, что с ними будет, если выплывет правда о Поттерах. Миссис Поттер приходилась миссис Дурсль родной сестрой, но они не виделись вот уже несколько лет. Миссис Дурсль даже делала вид, что у нее вовсе нет никакой сестры, потому что сестра и ее никчемный муж были полной противоположностью Дурслям.\n" +
                "\n" +
                "Дурсли содрогались при одной мысли о том, что скажут соседи, если на Тисовую улицу пожалуют Поттеры. Дурсли знали, что у Поттеров тоже есть маленький сын, но они никогда его не видели. И они категорически не хотели, чтобы их Дадли общался с ребенком таких родителей.\n";

        int choice;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("1 - отсортировать абзацы по количеству предложений \n" +
                    "2 - в каждом предложении отсортировать слова по длине \n" +
                    "3 - отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту \n");
            choice = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        }

        switch (choice) {
            case 1: {
                sortParagraph(text);
                break;
            }
            case 2: {
                sortWordsByLength(text);
                break;
            }
            case 3: {
                sortLexeme(text);
            }
            default:
                break;
        }

    }


    //1 - отсортировать абзацы по количеству предложений
    private static void sortParagraph(String text) {
        Pattern patternParagraph;
        Pattern patternSentence;
        Matcher matcher;
        String[] paragraph;
        int[] countSentences;

        patternParagraph = Pattern.compile("\\n+");
        patternSentence = Pattern.compile("\\S.+?[.?!]");

        paragraph = patternParagraph.split(text);
        countSentences = new int[paragraph.length];

        for (int i = 0; i < paragraph.length; i++) {
            matcher = patternSentence.matcher(paragraph[i]);
            while (matcher.find()) {
                countSentences[i]++;
            }
        }

        int tmpInt;
        String tmpString;
        for (int i = 0; i < paragraph.length; i++) {
            for (int j = 0; j < paragraph.length - 1; j++) {
                if (countSentences[j] < countSentences[j + 1]) {
                    tmpInt = countSentences[j];
                    countSentences[j] = countSentences[j + 1];
                    countSentences[j + 1] = tmpInt;

                    tmpString = paragraph[j];
                    paragraph[j] = paragraph[j + 1];
                    paragraph[j + 1] = tmpString;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (String s : paragraph) {
            result.append(s).append("\n\n");
        }
        System.out.println(result);
    }

    //2 - в каждом предложении отсортировать слова по длине
    private static void sortWordsByLength(String text) {
        Pattern patternParagraph;
        Pattern patternSentence;
        Matcher matcherParagraph;
        Pattern patternSplitWord;
        String[] words;
        StringBuilder result = new StringBuilder();

        patternParagraph = Pattern.compile("\\n+");
        patternSentence = Pattern.compile("\\S.+?[.?!]");
        patternSplitWord = Pattern.compile("[,:.]?\\s");

        for (String paragraph : patternParagraph.split(text)) {
            matcherParagraph = patternSentence.matcher(paragraph);

            while (matcherParagraph.find()) {
                words = patternSplitWord.split(paragraph.substring(matcherParagraph.start(), matcherParagraph.end() - 1));

                String tmp;
                for (int i = 0; i < words.length; i++) {
                    for (int j = 0; j < words.length - 1; j++) {
                        if (words[j].length() < words[j + 1].length()) {
                            tmp = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = tmp;
                        }
                    }
                }

                for (String w : words) {
                    result.append(w).append(' ');
                }
                result = new StringBuilder(result.substring(0, result.length() - 1)).append(paragraph.charAt(matcherParagraph.end() - 1)).append(' ');
            }
            result.append("\n\n");
        }
        System.out.println(result);
    }

    //3 - отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту
//    Pattern patternWord = Pattern.compile("[A-zА-я]+-?[A-zА-я]*");
    private static void sortLexeme(String text) {
        char ch;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите символ для сортировки: ");
            ch = (char) reader.read();
        } catch (IOException e) {
            System.out.println("Ошибка ввода");
            return;
        }


        Pattern patternParagraph;
        Pattern patternSentence;
        Matcher matcherParagraph;
        Pattern patternSplitWord;
        String[] words;
        StringBuilder result = new StringBuilder();

        patternParagraph = Pattern.compile("\\n+");
        patternSentence = Pattern.compile("\\S.+?[.?!]");
        patternSplitWord = Pattern.compile("[,:.]?\\s");

        for (String paragraph : patternParagraph.split(text)) {
            matcherParagraph = patternSentence.matcher(paragraph);

            while (matcherParagraph.find()) {
                words = patternSplitWord.split(paragraph.substring(matcherParagraph.start(), matcherParagraph.end() - 1));

                String tmp;
                for (int i = 0; i < words.length; i++) {
                    for (int j = 0; j < words.length - 1; j++) {
                        if (countCh(words[j].toLowerCase(), ch) < countCh(words[j + 1].toLowerCase(), ch)) {
                            tmp = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = tmp;
                        } else if ((countCh(words[j].toLowerCase(), ch) == countCh(words[j + 1].toLowerCase(), ch)) && words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                            tmp = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = tmp;

                        }
                    }
                }

                for (String w : words) {
                    result.append(w).append(' ');
                }
                result = new StringBuilder(result.substring(0, result.length() - 1)).append(paragraph.charAt(matcherParagraph.end() - 1)).append(' ');
            }
            result.append("\n\n");
        }
        System.out.println(result);

    }

    //возвращает количество символов ch в строке word
    private static int countCh(String word, char ch) {
        return word.length() - word.replaceAll(String.valueOf(ch), "").length();
    }

}
