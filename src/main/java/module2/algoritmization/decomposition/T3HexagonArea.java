package module2.algoritmization.decomposition;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.
 */
public class T3HexagonArea {
    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите длину стороны шестиугольника a: ");
            a = sc.nextInt();
        } catch (
                InputMismatchException e) {
            System.out.println("Ошибка ввода данных");
            return;
        } finally {
            sc.close();
        }

        System.out.printf("Площадь шестиугольника со стороной %d равна %.3f\n", a, getAreaTriangle(a, a) * 6);

    }

    private static double getAreaTriangle(int a, int b) {
        return (a * a * Math.sin(Math.toRadians(60))) / 2;
    }

    //формула площади равностороннего треугольника
    private static double getAreaEquilateralTriangle(int a) {
        return (Math.sqrt(3) / 4) * a * a;
    }

}
