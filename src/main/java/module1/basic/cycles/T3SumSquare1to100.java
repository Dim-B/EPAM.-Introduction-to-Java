package module1.basic.cycles;

/*
3. Найти сумму квадратов первых ста чисел.
 */

public class T3SumSquare1to100 {
    public static void main(String[] args) {
        System.out.println("Сумма квадратов первых 100 чисел равна: " + getSumSquare1toN(100));
//        System.out.println("Сумма квадратов первых 100 чисел равна(вычисление по формуле): " + getSumSquare1toNFormula(100));
//        System.out.println("Сумма квадратов первых 100 чисел равна(вычисление методом с использованием рекурсии): " + getSumSquare1toNRecursion(100));
    }

    private static int getSumSquare1toN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += Math.pow(i, 2);
        return sum;
    }

    private static int getSumSquare1toNFormula(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }

    private static int getSumSquare1toNRecursion(int n) {
        if (n == 1)
            return 1;
        else return (int) (Math.pow(n, 2) + getSumSquare1toNRecursion(--n));
    }

}
