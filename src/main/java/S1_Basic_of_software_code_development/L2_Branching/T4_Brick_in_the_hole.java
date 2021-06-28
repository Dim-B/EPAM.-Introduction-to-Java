package S1_Basic_of_software_code_development.L2_Branching;

/*
4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T4_Brick_in_the_hole {
    public static void main(String[] args) throws IOException {
        double a, b, x, y, z;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите размер отверстия A: ");
            a = Double.parseDouble(reader.readLine());
            System.out.print("Введите размер отверстия B: ");
            b = Double.parseDouble(reader.readLine());
            System.out.print("Введите размер кирпича x: ");
            x = Double.parseDouble(reader.readLine());
            System.out.print("Введите размер кирпича y: ");
            y = Double.parseDouble(reader.readLine());
            System.out.print("Введите размер кирпича z: ");
            z = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        }
        reader.close();

        if (isBrickInHole(a, b, x, y, z))
            System.out.println("Кирпич пройдет в отверстие");
        else
            System.out.println("Кирпич в отверстие не пройдет");

    }

    private static boolean isBrickInHole(double a, double b, double x, double y, double z) {
        return (a > x && (b > y || b > z)) ||
                (a > y && (b > x || b > y)) ||
                (a > z && (b > x || b > y));
    }

}
