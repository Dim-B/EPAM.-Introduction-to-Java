package module4.programmingwithclass.simplestclass.t5;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса
 */
public class T5Main {
    public static void main(String[] args) {
        Counter counter = null;

        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {

                int choose;
                System.out.println("Выберите действие: ");
                System.out.println("1 - Создать счетчик");
                System.out.println("2 - Получить текущее состояние счетчика");
                System.out.println("3 - Увеличить значение счетчика на 1");
                System.out.println("4 - Уменьшить значение счетчика на 1");
                System.out.println("5 - Выход");


                choose = scanner.nextInt();
                switch (choose) {
                    case (1): {
                        int chooseInit;
                        System.out.println("Выберите способ инициализации счетчика: ");
                        System.out.println("1 - инициализировать по умолчанию");
                        System.out.println("2 - инициализировать произвольными значениями");

                        chooseInit = scanner.nextInt();
                        if (chooseInit == 1) {
                            counter = new Counter();

                            System.out.println("Счетчик успешно создан.");
                        } else if (chooseInit == 2) {
                            int value;
                            int maxValue;
                            int minValue;

                            System.out.println("Введите начальное значение счетчика: ");
                            value = scanner.nextInt();

                            System.out.println("Введите максимальное значение счетчика: ");
                            maxValue = scanner.nextInt();

                            System.out.println("Введите минимальное значение счетчика: ");
                            minValue = scanner.nextInt();

                            if (minValue > maxValue) {
                                System.out.println("Ошибка создания счетчика. \nМинимальное значение не может превышать максимальное значение.");
                                break;
                            }

                            counter = new Counter(value, maxValue, minValue);

                            System.out.println("Счетчик успешно создан.");

                        } else {
                            System.out.println("Ошибка выбора. Попробуйте еще раз.");
                        }
                        break;
                    }
                    case (2): {
                        if (counter == null) {
                            System.out.println("Сначала нужно создать счетчик.");
                        } else {
                            counter.showState();
                        }
                        break;
                    }
                    case (3): {
                        if (counter == null) {
                            System.out.println("Сначала нужно создать счетчик.");
                        } else if (counter.increase()) {
                            System.out.println("Значение счетчика увеличено.");
                        } else {
                            System.out.println("Счетчик достиг максимального значения и не может быть увеличен.");
                        }
                        break;
                    }
                    case (4): {
                        if (counter == null) {
                            System.out.println("Сначала нужно создать счетчик.");
                        } else if (counter.decrease()) {
                            System.out.println("Значение счетчика уменьшено.");
                        } else {
                            System.out.println("Счетчик достиг минимального значения и не может быть уменьшен.");
                        }
                        break;
                    }
                    case (5): {
                        scanner.close();
                        System.exit(1);
                    }
                    default: {
                        System.out.println("Ошибка выбора. Попробуйте еще раз");
                    }
                }
                System.out.println();
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода данных. Перезапустите программу");
            System.exit(1);
        }

    }
}
