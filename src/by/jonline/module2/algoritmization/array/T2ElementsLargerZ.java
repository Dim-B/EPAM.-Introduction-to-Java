package module2.algoritmization.array;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен
 */

public class T2ElementsLargerZ {
    public static void main(String[] args) {
        int[] array;
        int z = 0;

        array = UtilsArrays.getArray();

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите Z: ");
            z = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
        } finally {
            scanner.close();
        }

        System.out.println("Преобразованная последовательность:");
        UtilsArrays.printArray(replaceZ(array, z));
    }

    private static int[] replaceZ(int[] array, int z) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z)
                array[i] = z;
        }
        return array;
    }

}
