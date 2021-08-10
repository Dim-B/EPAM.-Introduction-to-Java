package module3.string.stringasarray;

/*
 * 2. Замените в строке все вхождения 'word' на 'letter'
 */
public class T2WordToLetter {

    public static void main(String[] args) {
        String str = "I see this word, hear this word, feel this word everywhere.";

        System.out.println(str);
        System.out.println("Замена \"word\" на \"letter\" : ");
        System.out.println(replaceWordToLetter(str));

    }

    public static String replaceWordToLetter(String str) {
        char[] strChar = str.toCharArray();
        char[] tmp;

        for (int i = 0; i < strChar.length - 3; i++) {
            if (strChar[i] == 'w' && strChar[i + 1] == 'o' && strChar[i + 2] == 'r' && strChar[i + 3] == 'd') {
                tmp = new char[strChar.length + 2];
                for (int j = 0; j < tmp.length; j++) {
                    if (j < i) {
                        tmp[j] = strChar[j];
                    } else if (j == i) {
                        tmp[j++] = 'l';
                        tmp[j++] = 'e';
                        tmp[j++] = 't';
                        tmp[j++] = 't';
                        tmp[j++] = 'e';
                        tmp[j] = 'r';
                    } else {
                        tmp[j] = strChar[j - 2];
                    }
                }
                strChar = tmp;
            }
        }

        str = new String(strChar);

        return str;
    }
}