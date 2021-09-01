package module3.string.stringandstringbuilder;

/*
5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
*/
public class T5CountA {
    public static void main(String[] args) {
        String str = "0u1oqbxcactmx3dko7e6fvl9lxfhunhenavxsp4rn1dcqgze4tizaaebe2k7nwaqr2k73boafip4nrrs2fw2ymfcydtg3x5tlrsd";

        System.out.println("Количество букв \"a\" равно: " + countA(str));
    }

    private static int countA(String str) {
        int count = 0;
        int pos = -1;

        while (true) {
            pos = str.indexOf('a', pos + 1);
            if (pos == -1) {
                return count;
            } else {
                count++;
            }
        }
    }
}
