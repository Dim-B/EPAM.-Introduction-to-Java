package module3.string.stringandstringbuilder;

/*
6. Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class T6DoubleChar {
    public static void main(String[] args) {
        String str = "jus5r5p4r44wa128";

        str = doubleChar(str);
        System.out.println(str);
    }

    private static String doubleChar(String str) {
        for (int i = 0; i < str.length(); i += 2) {
            str = str.substring(0, i) + str.charAt(i) + str.substring(i);
        }
        return str;
    }
}
