package S1_Basic_of_software_code_development.L3_Cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class T6_Symbol_code_table {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Таблица соответствий основных символов: ");
            for (String s :getSymbolTable(33, 126)){
                System.out.println(s);
            }
            String symbols;
            System.out.print("Вы можете ввести любой другой символ(или несколько): ");
            symbols = reader.readLine();
            for (String s :getSymbolTable(symbols)){
                System.out.println(s);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        reader.close();

    }

    private static String[] getSymbolTable(String symbols) {
        String[] table = new String[symbols.length()];
        char[] charTable = symbols.toCharArray();
        for (int i = 0; i < symbols.length(); i++) {
            table[i] = charTable[i] + " - " + (int) (charTable[i]);
        }
        return table;
    }

    private static String[] getSymbolTable(int startPos, int endPos) {
        String[] table = new String[endPos - startPos+1];
        for (int i = 0; i <= endPos - startPos; i++) {
            table[i] = (char) (i + startPos) + " - " + (i + startPos);
        }
        return table;
    }

}
