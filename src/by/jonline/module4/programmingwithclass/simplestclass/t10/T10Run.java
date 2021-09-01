package module4.programmingwithclass.simplestclass.t10;

/*
10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class T10Run {
    public static void main(String[] args) {
        AirlineLogic logic = new AirlineLogic();

        System.out.println("Список рейсов летающих в Минск: ");
        logic.printAirlineByDestination("Минск");
        System.out.println();

        System.out.println("Список рейсов летающих по понедельникам: ");
        logic.printAirlineByDay("понедельник");
        System.out.println();

        System.out.println("Список рейсов летающих по средам после 13:00: ");
        logic.printAirlineByDayAndTime("среда", "13:00");


    }
}
