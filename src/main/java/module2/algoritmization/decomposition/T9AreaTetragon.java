package module2.algoritmization.decomposition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
*/
public class T9AreaTetragon {
    public static void main(String[] args) throws IOException {
        int x, y, z, t;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите значение X: ");
            x = Integer.parseInt(reader.readLine());
            System.out.print("Введите значение Y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Введите значение Z: ");
            z = Integer.parseInt(reader.readLine());
            System.out.print("Введите значение T: ");
            t = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        } finally {
            reader.close();
        }

        System.out.println("Площадь заданного четырехугольника равна: " + getTetragonArea(x, y, z, t));
    }

    private static double getTetragonArea(int x, int y, int z, int t) {
        int p = (x + y + z + t) / 2;
        return Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));
    }
}
