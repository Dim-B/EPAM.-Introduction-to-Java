package module2.algoritmization.decomposition;

/*
7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class T7SumFactorials {
    public static void main(String[] args) {
        System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 равна " + getSumFactOdd1to9());
    }

    private static int getSumFactOdd1to9() {
        int sum = 0;
        for (int i = 1; i <= 9; i += 2) {
            sum += fact(i);
        }
        return sum;
    }

    public static long fact(int n) {
        if (n < 0)
            return -1;
        else if (n == 1 || n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }

}
