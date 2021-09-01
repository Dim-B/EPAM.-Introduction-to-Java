package module4.programmingwithclass.simplestclass.t6;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.
 */
public class T6Run {
    public static void main(String[] args) {
        Time time = new Time();

        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {

                int choose;
                System.out.println("Выберите действие: ");
                System.out.println("1 - Получить время");
                System.out.println("2 - Установить время");
                System.out.println("3 - Изменить время");
                System.out.println("4 - Выход");


                choose = scanner.nextInt();
                switch (choose) {
                    case (1): {
                        time.showTime();
                        break;
                    }
                    case (2): {
                        int chooseSetTime;
                        System.out.println("Выберите действие: ");
                        System.out.println("1 - Установить часы");
                        System.out.println("2 - Установить минуты");
                        System.out.println("3 - Установить секунды");
                        System.out.println("4 - Вернуться");


                        chooseSetTime = scanner.nextInt();
                        switch (chooseSetTime) {
                            case (1): {
                                System.out.println("Введите значение часов: ");
                                time.setHours(scanner.nextInt());
                                time.showTime();
                                break;
                            }
                            case (2): {
                                System.out.println("Введите значение минут: ");
                                time.setMinutes(scanner.nextInt());
                                time.showTime();
                                break;
                            }
                            case (3): {
                                System.out.println("Введите значение секунд: ");
                                time.setSeconds(scanner.nextInt());
                                time.showTime();
                                break;
                            }
                            case (4): {
                                break;
                            }
                            default: {
                                System.out.println("Ошибка выбора. Попробуйте еще раз");
                            }
                        }
                        break;
                    }
                    case (3): {
                        int chooseChangeTime;
                        System.out.println("Выберите действие: ");
                        System.out.println("1 - Изменить часы");
                        System.out.println("2 - Изменить минуты");
                        System.out.println("3 - Изменить секунды");
                        System.out.println("4 - Вернуться");


                        chooseChangeTime = scanner.nextInt();
                        switch (chooseChangeTime) {
                            case (1): {
                                System.out.println("На сколько часов изменить время: ");
                                time.changeHours(scanner.nextInt());
                                time.showTime();
                                break;
                            }
                            case (2): {
                                System.out.println("На сколько минут изменить время: ");
                                time.changeMinutes(scanner.nextInt());
                                time.showTime();
                                break;
                            }
                            case (3): {
                                System.out.println("На сколько секунд изменить время: ");
                                time.changeSeconds(scanner.nextInt());
                                time.showTime();
                                break;
                            }
                            case (4): {
                                break;
                            }
                            default: {
                                System.out.println("Ошибка выбора. Попробуйте еще раз");
                            }
                        }
                        break;
                    }
                    case (4): {
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
