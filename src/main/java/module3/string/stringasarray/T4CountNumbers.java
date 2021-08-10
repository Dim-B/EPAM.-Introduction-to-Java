package module3.string.stringasarray;

/*
4. В строке найти количество чисел.
 */
public class T4CountNumbers {
    public static void main(String[] args) {
        String str = "BnUZa3XZM6dfFxfHXzlZDGVjL7JlsRVgbkYD8tzeB0Eyir1Y74afpkcFIzw0M60Oe682ygKyk7xhKJhNzRa1z8dmYm9bLaAjjluQ";

        System.out.println(str);
        System.out.println("Количество чисел в строке: " + countNumbers(str));

    }

    private static int countNumbers(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9' && (i == str.length() - 1 || (str.charAt(i + 1) < '0' || str.charAt(i + 1) > '9'))) {
                count++;
            }
        }
        return count;
    }
}
