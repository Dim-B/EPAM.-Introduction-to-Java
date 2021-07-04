package module2.algoritmization.array;

/*
7. Даны действительные числа a1, a2, ..., an. Найти max(a1 + an, a2 + an−1, ..., an/2 + an/2+1)
.
 */

public class T7MaxSum {
    public static void main(String[] args) {
        int[] array;
        int max;

        array = UtilsArrays.getArray();
        max = array[0] + array[array.length - 1];

        for (int i = 0; i < array.length/2; i++) {
            if (array[i]+array[array.length-i-1]>max) max = array[i]+array[array.length-i-1];
        }
        System.out.println("max(a1 + an, a2 + an−1, ..., an/2 + an/2+1) = : " + max);
    }

}
