package module3.string.regexp;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Дана строка, содержащая следующий текст (xml-документ):
<notes>
    <note id = "1">
        <to>Вася</to>
        <from>Света</from>
        <heading>Напоминание</heading>
        <body>Позвони мне завтра!</body>
    </note>
    <note id = "2">
        <to>Петя</to>
        <from>Маша</from>
        <heading>Важное напоминание</heading>
        <body/>
    </note>
</notes>
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
нельзя.
 */
public class T2ParseXML {
    public static void main(String[] args) {
        String xmlDoc =     "<notes>\n" +
                            "   <note id = \"1\">\n" +
                            "       <to>Вася</to>\n" +
                            "       <from>Света</from>\n" +
                            "       <heading>Напоминание</heading>\n" +
                            "       <body>Позвони мне завтра!</body>\n" +
                            "   </note>\n" +
                            "   <note id = \"2\">\n" +
                            "       <to>Петя</to>\n" +
                            "       <from>Маша</from>\n" +
                            "       <heading>Важное напоминание</heading>\n" +
                            "       <body/>\n" +
                            "   </note>\n" +
                            "</notes>\n";


        Pattern patternOpenTag;
        Matcher matcherOpenTag;
        Pattern patternTagName;
        Matcher matcherTagName;
        Pattern patternCloseTag;
        Matcher matcherCloseTag;
        ArrayList<String[]> nodes = new ArrayList<String[]>();
        String openTag;
        String tagName;
        String closeTag;
        String body;

        patternOpenTag = Pattern.compile("[<]\\w.+?[>]");
        matcherOpenTag = patternOpenTag.matcher(xmlDoc);
        patternTagName = Pattern.compile("[<]\\w+");

        while (matcherOpenTag.find()) {
            openTag = xmlDoc.substring(matcherOpenTag.start(), matcherOpenTag.end());

            matcherTagName = patternTagName.matcher(openTag);
            //noinspection ResultOfMethodCallIgnored
            matcherTagName.find();
            tagName = openTag.substring(1, matcherTagName.end());

            patternCloseTag = Pattern.compile("[<][/]" + tagName + "[>]");
            matcherCloseTag = patternCloseTag.matcher(xmlDoc);
            if (matcherCloseTag.find(matcherOpenTag.start())) {
                closeTag = xmlDoc.substring(matcherCloseTag.start(), matcherCloseTag.end());
                body = xmlDoc.substring(matcherOpenTag.end(), matcherCloseTag.start());
            } else {
                closeTag = "";
                body = "";
            }

            nodes.add(new String[]{openTag, closeTag, body});
        }

        for (int i = 0; i < nodes.size(); i++) {
            System.out.println("Узел " + (i + 1) + ": ");
            System.out.println(nodes.get(i)[0] + nodes.get(i)[2] + nodes.get(i)[1]);
            System.out.println("Открывающий тег: " + nodes.get(i)[0] + "\nЗакрывающий тег: " + nodes.get(i)[1]);
            System.out.println("Содержимое: " + nodes.get(i)[2]);
        }
    }
}
