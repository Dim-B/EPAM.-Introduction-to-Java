package module4.programmingwithclass.aggregationandcomposition.t5;

import java.util.List;

public class Printer {
    public void printTour(Tour t) {
        System.out.println(t.getName() +
                ", тип тура: " + t.getTypeTour().getName() +
                ", проезд: " + t.getTypeTransport().getName() +
                ", питание: " + t.getTypeFood().getName() +
                ", продолжительность: " + t.getDuration() +
                ", цена: " + t.getPrice());
    }

    public void printBase(List<Tour> tours) {
        if (tours.isEmpty()) {
            System.out.println("На данный момент по вашему фильтру отсутствуют туры");
        } else {
            for (Tour t : tours) {
                printTour(t);
            }
        }
    }

}
