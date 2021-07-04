package module2.algoritmization.array;

/*
10. Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class T10CompressingArray {
    public static void main(String[] args) {
        int[] array;

        array = UtilsArrays.getArray();

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.println("Сжатый массив: ");
        UtilsArrays.printArray(array);
    }
}
