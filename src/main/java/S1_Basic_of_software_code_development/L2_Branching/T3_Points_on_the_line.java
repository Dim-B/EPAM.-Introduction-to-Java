package S1_Basic_of_software_code_development.L2_Branching;

/*
3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T3_Points_on_the_line {
    public static void main(String[] args) throws IOException {
        double x1, y1, x2, y2, x3, y3;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите значение x1: ");
            x1 = Double.parseDouble(reader.readLine());
            System.out.print("Введите значение y1: ");
            y1 = Double.parseDouble(reader.readLine());
            System.out.print("Введите значение x2: ");
            x2 = Double.parseDouble(reader.readLine());
            System.out.print("Введите значение y2: ");
            y2 = Double.parseDouble(reader.readLine());
            System.out.print("Введите значение x3: ");
            x3 = Double.parseDouble(reader.readLine());
            System.out.print("Введите значение y3: ");
            y3 = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        }
        reader.close();

        if (isPointsOnLine(x1, y1, x2, y2, x3, y3))
            System.out.println("Заданные точки расположены на одной прямой");
        else
            System.out.println("Заданные точки не расположены на одной прямой");

    }

    private static boolean isPointsOnLine(double x1, double y1, double x2, double y2, double x3, double y3) {
        double accuracy = 0.0000000001;
        return (x1==x2 && x2==x3) || (y1==y2 && y2==y3) || Math.pow(((x3 - x1) / (x2 - x1) - (y3 - y1) / (y2 - y1)), 2) <= accuracy;
    }

}
