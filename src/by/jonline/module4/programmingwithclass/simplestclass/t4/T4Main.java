package module4.programmingwithclass.simplestclass.t4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */
public class T4Main {
    public static void main(String[] args) {
        Train[] trains = new Train[]{
                new Train("Минск", 2268, "18:30"),
                new Train("Брест", 6687, "11:45"),
                new Train("Могилев", 5618, "10:28"),
                new Train("Витебск", 1258, "14:00"),
                new Train("Минск", 4658, "12:30")
        };

        TrainLogic trainLogic = new TrainLogic();
        TrainView view = new TrainView();

        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {

                view.printMenu();

                int choose;
                choose = scanner.nextInt();
                switch (choose) {
                    case (1): {
                        view.printTrains(trains);
                        break;
                    }
                    case (2): {
                        view.printTrains(trainLogic.sortByNumber(trains));
                        break;
                    }
                    case (3): {
                        view.printMessage("Введите номер поезда: ");
                        int number = scanner.nextInt();
                        view.printTrainInfo(trainLogic.getTrainInfo(trains, number));
                        break;
                    }
                    case (4): {
                        view.printTrains(trainLogic.sortByDestination(trains));
                        break;
                    }
                    case (5): {
                        scanner.close();
                        view.printMessage("Приятной поездки");
                        System.exit(1);
                    }
                    default: {
                        view.printMessage("Ошибка выбора. Попробуйте еще раз");
                    }
                }
                System.out.println();
            }

        } catch (InputMismatchException e) {
            view.printMessage("Ошибка ввода данных. Перезапустите программу");
            System.exit(1);
        }
    }


}
