package module3.string.stringandstringbuilder;

/*
3. Проверить, является ли заданное слово палиндромом.
*/
public class T3CheckPalindrome {
    public static void main(String[] args) {
        String str1 = "комок";
        String str2 = "комод";

        if (isPalindrome(str1)) {
            System.out.printf("Слово \"%s\" является палиндромом\n", str1);
        } else {
            System.out.printf("Слово \"%s\" не является палиндромом\n", str1);
        }

        if (isPalindrome(str2)) {
            System.out.printf("Слово \"%s\" является палиндромом\n", str2);
        } else {
            System.out.printf("Слово \"%s\" не является палиндромом\n", str2);
        }
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
