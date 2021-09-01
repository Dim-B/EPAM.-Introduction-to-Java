package module3.string.stringasarray;

/*
3. В строке найти количество цифр.
 */
public class T3CountDigits {
    public static void main(String[] args) {
        String str = "BnUZa3XZM6dfFxfHXzlZDGVjL7JlsRVgbkYD8tzeB0Eyir1Y74afpkcFIzw0M60Oe682ygKyk7xhKJhNzRa1z8dmYm9bLaAjjluQ";

        System.out.println(str);
        System.out.println("Количество цифр в строке: " + countDigits(str));

    }

    private static int countDigits(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
            }
        }
        return count;
    }
}





















































