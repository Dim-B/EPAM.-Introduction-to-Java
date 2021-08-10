package module3.string.stringandstringbuilder;

/*
4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
*/
public class T4FormTort {
    public static void main(String[] args) {
        String str1 = "информатика";
        String str2;

        str2 = str1.substring(7,8).concat(str1.substring(3,5)).concat(str1.substring(7,8));

        System.out.println(str2);
    }
}
