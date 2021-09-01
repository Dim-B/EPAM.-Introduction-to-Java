package module3.string.stringandstringbuilder;

/*
9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.
 */
public class T9CountLetter {
    public static void main(String[] args) {
        String str = "8EaQoOz1sk  c6 Zu6WYRPSMAlHK xuvx4T7UFO9eQCv6SndIndHy75VMwqfSoXvvAkynJ 65tD0F4uy vjXM94vHS1D9e5Df8t";

        System.out.println("Количество строчных букв: " + countLowercaseLetter(str));
        System.out.println("Количество прописных букв: " + countUppercaseLetter(str));
    }

    private static int countLowercaseLetter(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count++;
            }
        }

        return count;
    }

    private static int countUppercaseLetter(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                count++;
            }
        }

        return count;
    }
}
