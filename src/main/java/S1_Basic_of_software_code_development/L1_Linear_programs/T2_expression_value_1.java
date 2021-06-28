package S1_Basic_of_software_code_development.L1_Linear_programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((b+sqr(b^2+4*a*c))/2*a)-a^3*c+b^(-2)
 */

public class T2_expression_value_1 {
    public static void main(String[] args) throws IOException {
        double a, b, c;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите значение a: ");
            a = Double.parseDouble(reader.readLine());
            System.out.print("Введите значение b: ");
            b = Double.parseDouble(reader.readLine());
            System.out.print("Введите значение c: ");
            c = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        }
        reader.close();

        System.out.println("Значение выражения ((b+sqr(b^2+4*a*c))/2*a)-a^3*c+b^(-2) равно: " + calculateEXP(a, b, c));

    }

    private static double calculateEXP(double a, double b, double c) {
        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
