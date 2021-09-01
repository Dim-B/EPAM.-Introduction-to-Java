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
public class Airport {
    private static Airport airport = null;
    private final Airline[] airlines;


    private Airport() {
        this.airlines = getData();
    }

    public static Airport getInstance() {
        if (airport == null) {
            airport = new Airport();
        }
        return airport;
    }

    private Airline[] getData() {
        return new Airline[]{
                new Airline("Минск", 654236, "грузовой", "12:30", new String[]{"понедельник", "среда", "пятница"}),
                new Airline("Москва", 687521, "почтовый", "10:00", new String[]{"понедельник", "вторник", "пятница", "суббота"}),
                new Airline("Вильнюс", 874658, "пассажирский", "19:50", new String[]{"среда", "суббота"}),
                new Airline("Минск", 156879, "пассажирский", "16:40", new String[]{"суббота"}),
                new Airline("Москва", 625487, "пассажирский", "14:20", new String[]{"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"}),
        };
    }

    public Airline[] getAirlines() {
        return airlines;
    }
}
