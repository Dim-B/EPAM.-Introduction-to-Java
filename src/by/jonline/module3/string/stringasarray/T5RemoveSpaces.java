package module3.string.stringasarray;

/*
5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */
public class T5RemoveSpaces {
    public static void main(String[] args) {
        String str = " Том не  был   самым  примерным мальчиком   в городе,   зато очень  хорошо знал  самого   примерного мальчика   –  и терпеть  его не   мог . ";

        str = removeSpaces(str);
        System.out.println(str);

    }

    private static String removeSpaces(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && (i == 0 || i == str.length() - 1 || str.charAt(i + 1) == ' ' || str.charAt(i + 1) == '.' || str.charAt(i + 1) == ',' || str.charAt(i + 1) == '!' || str.charAt(i + 1) == '?' || str.charAt(i + 1) == ':' || str.charAt(i + 1) == ';')) {
                str = removeCharAt(str, i);
                i--;
            }
        }

        return str;
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
