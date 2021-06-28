package S1_Basic_of_software_code_development.L1_Linear_programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class T4_Swap_number {
    public static void main(String[] args) throws IOException {
        String r;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число R: ");
            r = reader.readLine();
            Double.parseDouble(r);

            if (!r.matches("^\\d{3}\\.\\d{3}$")) {
                System.out.println("Введенное число не удовлетворяет условию задачи");
                return;
            }

        } catch (NumberFormatException e) {
            System.out.println("Введены неверные данные");
            return;
        }
        reader.close();

            System.out.println("Полученное число: " + swapNumber(r));

    }

    private static String swapNumber(String r) {
        return r.substring(4,7)+r.charAt(3)+r.substring(0,3);
    }

}


