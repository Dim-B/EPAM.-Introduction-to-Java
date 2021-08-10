package module3.string.stringandstringbuilder;

/*
8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.
 */
public class T8LongestWord {
    public static void main(String[] args) {
        String str = "6b1t7t z yp39 g v1 q2nmsn kk698g8 0xiludjc 6x 5 n1s0dt9k2uojwkcq jb gg2 d0kst7x5afftj6r ns1vtw3";

        System.out.println("Самое длинное слово: " + findLongestWord(str));
    }

    private static String findLongestWord(String str) {
        String longestWord = "";
        String word;
        int posStart = 0;
        int posEnd;

        posEnd = str.indexOf(" ");

        while (posEnd != str.length()) {
            posEnd = str.indexOf(" ", posStart);
            if (posEnd == -1) {
                posEnd = str.length();
            }

            word = str.substring(posStart, posEnd);
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }

            posStart = posEnd + 1;
        }


        return longestWord;
    }
}
