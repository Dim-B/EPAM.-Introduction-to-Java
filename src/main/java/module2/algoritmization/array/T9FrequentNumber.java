package module2.algoritmization.array;

/*
9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
 */
public class T9FrequentNumber {
    public static void main(String[] args) {
        int[] array;
        int frequentNumber;
        int countFrequent = 0;
        int count;

        array = UtilsArrays.getArray();
        frequentNumber = array[0];

        for (int an : array) {
            count = 0;
            for (int ai : array) {
                if (ai == an) count++;
            }
            if (count > countFrequent) {
                frequentNumber = an;
                countFrequent = count;
            } else if (count == countFrequent) {

                if (an < frequentNumber) {
                    frequentNumber = an;
                    countFrequent = count;

                }
            }
        }

        System.out.println("Наиболее часто встречающееся число: " + frequentNumber);
    }

}

