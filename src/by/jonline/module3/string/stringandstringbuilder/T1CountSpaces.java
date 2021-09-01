package module3.string.stringandstringbuilder;

/*
1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class T1CountSpaces {
    public static void main(String[] args) {
        String str = " j eV0H FiRmsw NVn EZ4Me4q 7R b  D  qI  N     FYBbns  ofWnosoaG Q yge g  K L  xku T   50    K  R   m";

        System.out.println("Наибольшее количество подряд идущих пробелов: " + maxCountConsecutiveSpaces(str));
    }

    private static int maxCountConsecutiveSpaces(String str) {
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            } else {
                count = 0;
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
    }
}
