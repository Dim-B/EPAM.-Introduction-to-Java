package module3.string.stringandstringbuilder;

/*
7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef".
 */
public class T7DuplicateCharacters {
    public static void main(String[] args) {
        String str = "abc cde def";

        str = removeSpaces(str);
        str = removeDuplicates(str);

        System.out.println(str);
    }

    private static String removeDuplicates(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(0, i).indexOf(str.charAt(i)) != -1) {
                str = removeCharAt(str, i);
                i--;
            }
        }

        return str;
    }

    private static String removeSpaces(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
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
