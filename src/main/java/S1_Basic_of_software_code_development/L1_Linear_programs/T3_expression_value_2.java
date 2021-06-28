package S1_Basic_of_software_code_development.L1_Linear_programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦∗𝑡𝑔 𝑥𝑦
((sin(x)+cos(y))/(cos(x)-sin(y)))*tg(x)*y
 */

public class T3_expression_value_2 {
    public static void main(String[] args) throws IOException {
        double x, y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите x: ");
            x = Double.parseDouble(reader.readLine());
            System.out.print("Введите y: ");
            y = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        }
        reader.close();

        System.out.println("Значение выражения  равно: " + calculateEXP(x, y));

    }

    private static double calculateEXP(double x, double y) {
        return ((Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(y))) / (Math.cos(Math.toRadians(x)) - Math.sin(Math.toRadians(y))))*Math.tan(Math.toRadians(x))*y;
    }

}
