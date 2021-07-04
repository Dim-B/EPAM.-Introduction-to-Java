package module2.algoritmization.array;

/*
5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i
 */

public class T5NumbersLargestIndex {
    public static void main(String[] args) {
        int[] array;

        array = UtilsArrays.getArray();

        System.out.print("Числа, для которых аi > i: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i + 1) System.out.print(array[i] + ", ");
        }
    }
}