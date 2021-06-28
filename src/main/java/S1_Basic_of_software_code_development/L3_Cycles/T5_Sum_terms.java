package S1_Basic_of_software_code_development.L3_Cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид: an=1/2^n+1/3^n
 */

public class T5_Sum_terms {
    public static void main(String[] args) throws IOException {
        double e;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число e: ");
            e = Double.parseDouble(reader.readLine());
            if (e < 0) {
                System.out.println("Значение точности может принимать только положительные значения");
                return;
            }
        } catch (NumberFormatException exception) {
            System.out.println("Введены неверные данные");
            return;
        }
        reader.close();

        System.out.print("Сумма членов ряда, удовлетворяющая заданной точности, равна: " + getSumTerms(e));
    }

    private static double getSumTerms(double e) {
        double sum = 0;
        double an = 1 / Math.pow(2, 1) + 1 / Math.pow(3, 1);
        for (int n =2;  an >= e; n++) {
            sum += an;
            an = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
        }
        return sum;
    }
}
