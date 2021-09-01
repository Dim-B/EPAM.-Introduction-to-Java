package module4.programmingwithclass.simplestclass.t4;

public class TrainView {

    public void printTrains(Train[] trains) {
        for (Train t : trains) {
            printTrainInfo(t);
        }
        System.out.println();
    }

    public void printTrainInfo(Train train) {
        if (train != null) {
            System.out.printf("Поезд с номером %d следует до станции \"%s\". Время отправления %s\n", train.getTrainNumber(), train.getDestinationName(), train.getDepartureTime());
        } else {
            System.out.println("Поезд с указанным номером отсутствует в списке.");
        }

    }

    public void printMenu() {
        System.out.println("Выберите операцию для списка поездов: ");
        System.out.println("1 - Просмотреть список");
        System.out.println("2 - Отсортировать по номерам поездов");
        System.out.println("3 - Вывести информацию по номеру поезда");
        System.out.println("4 - Отсортировать по пункту назначения с учетом времени отправления");
        System.out.println("5 - Выход");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

}
