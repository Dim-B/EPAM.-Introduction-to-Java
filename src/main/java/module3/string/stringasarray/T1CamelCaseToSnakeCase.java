package module3.string.stringasarray;

/*
 * 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class T1CamelCaseToSnakeCase {
    public static void main(String[] args) {
        String[] names = {"BiCapitalization",
                "BumpyCaps",
                "BumpyCase",
                "CamelCaps",
                "CamelHumpedWord"};

        String[] namesSnakeCase;


        namesSnakeCase = toSnakeCase(names);

        System.out.println("Названия переменных в snake_case: ");
        for (String s : namesSnakeCase) {
            System.out.println(s);
        }

    }

    public static String[] toSnakeCase(String[] names) {

        for (int i = 0; i < names.length; i++) {
            char[] nameChar = names[i].toCharArray();

            int countWords = 0;
            for (char c : nameChar) {
                if (c >= 'A' && c <= 'Z') {
                    countWords++;
                }
            }

            char[] nameSnakeCase = new char[nameChar.length + countWords];
            int k = 0;
            for (int j = 0; j < nameChar.length; j++) {
                if (nameChar[j] >= 'A' && nameChar[j] <= 'Z') {
                    if (j != 0) {
                        nameSnakeCase[k++] = '_';
                    }
                    nameSnakeCase[k++] = (char) (nameChar[j] + 32);
                } else {
                    nameSnakeCase[k++] = (nameChar[j]);
                }
            }
            names[i] = new String(nameSnakeCase);
        }
        return names;
    }

}
