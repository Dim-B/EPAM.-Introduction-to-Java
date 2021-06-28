package S1_Basic_of_software_code_development.L3_Cycles;

import java.math.BigInteger;

/*
4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class T4_Multiplication_square_1to200 {
    public static void main(String[] args) {
        System.out.println("Произведение квадратов первых 200 чисел равно: " + getMultSqr1toN(200));
    }

    private static String getMultSqr1toN(int n) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i * i));
        return result.toString();
    }

}
