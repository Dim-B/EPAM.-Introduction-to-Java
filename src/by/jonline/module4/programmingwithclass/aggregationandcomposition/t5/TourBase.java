package module4.programmingwithclass.aggregationandcomposition.t5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TourBase {
    private List<Tour> base;

    public TourBase() {
        this.base = getData();
    }

    public void add(Tour tour) {
        base.add(tour);
    }

    public List<Tour> getBase() {
        return base;
    }

    public void setBase(List<Tour> base) {
        this.base = base;
    }

    private List<Tour> getData() {
        List<Tour> data = new ArrayList<>();

        data.add(new Tour("ЗОЛОТОЕ КОЛЬЦО АБХАЗИИ", TypeTour.EXCURSION, TypeFood.RO, TypeTransport.BUS, 4, 150));
        data.add(new Tour("Курорт Абхазии Гудаута",TypeTour.VACATION, TypeFood.BB, TypeTransport.TRAIN, 10, 600));
        data.add(new Tour("Шоп тур в Белосток",TypeTour.SHOPPING, TypeFood.RO, TypeTransport.BUS, 1, 20));
        data.add(new Tour("ШОП-ТУР В ВИЛЬНЮС",TypeTour.SHOPPING, TypeFood.RO, TypeTransport.BUS, 1, 15));
        data.add(new Tour("Морской курорт \"Ястребиная Гора\"",TypeTour.VACATION, TypeFood.RO, TypeTransport.BUS, 10, 650));
        data.add(new Tour("Речной круиз по Беларуси",TypeTour.CRUISE, TypeFood.FB, TypeTransport.WATER, 8, 450));
        data.add(new Tour("Круиз по Нилу",TypeTour.CRUISE, TypeFood.FB, TypeTransport.WATER, 8, 450));
        data.add(new Tour("Отдых на Кубе",TypeTour.VACATION, TypeFood.ALL, TypeTransport.PLANE, 15, 1320));
        data.add(new Tour("Всё самое интересное в Норвегии",TypeTour.EXCURSION, TypeFood.HB, TypeTransport.PLANE, 11, 1560));
        data.add(new Tour("Мандариновые приключения в солнечной Грузии",TypeTour.EXCURSION, TypeFood.BB, TypeTransport.PLANE, 7, 920));
        data.add(new Tour("БАРДЕЕВСКИЕ КУПЕЛИ Пансионат «КОЛИБРИК»",TypeTour.HEALING, TypeFood.RO, TypeTransport.BUS, 7, 210));
        data.add(new Tour("Курорт Лучки в Словакии",TypeTour.HEALING, TypeFood.BB, TypeTransport.NONE, 7, 260));

        return data;
    }

    @Override
    public String toString() {
        return "TourBase{" +
                "base=" + base +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourBase base1 = (TourBase) o;
        return Objects.equals(base, base1.base);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base);
    }
}
