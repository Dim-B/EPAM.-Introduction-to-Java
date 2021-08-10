package module3.string.stringandstringbuilder;

/*
2. В строке вставить после каждого символа 'a' символ 'b'.
 */
public class T2InsertB {
    public static void main(String[] args) {
        String str = "1d079a81 5a811 62a1021a050 05171b70d75bd3840 4188c3748b2 5c9156ccab 98cba0d97a4b76a5085a  2da3434826";

        str = makeBString(str);
        System.out.println(str);
    }

    private static String makeBString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                str = insertB(str, ++i);
            }
        }
        return str;
    }

    private static String insertB(String str, int i) {
        return str.substring(0, i) + 'b' + str.substring(i);
    }
}
