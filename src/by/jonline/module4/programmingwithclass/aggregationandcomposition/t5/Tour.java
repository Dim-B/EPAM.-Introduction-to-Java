package module4.programmingwithclass.aggregationandcomposition.t5;

import java.util.Objects;

/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class Tour {
    private String name;
    private TypeTour typeTour;
    private TypeFood typeFood;
    private TypeTransport typeTransport;
    private int duration;
    private long price;

    public Tour(String name, TypeTour typeTour, TypeFood typeFood, TypeTransport typeTransport, int duration, long price) {
        this.name = name;
        this.typeTour = typeTour;
        this.typeFood = typeFood;
        this.typeTransport = typeTransport;
        this.duration = duration;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeTour getTypeTour() {
        return typeTour;
    }

    public void setTypeTour(TypeTour typeTour) {
        this.typeTour = typeTour;
    }

    public TypeFood getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(TypeFood typeFood) {
        this.typeFood = typeFood;
    }

    public TypeTransport getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(TypeTransport typeTransport) {
        this.typeTransport = typeTransport;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "name='" + name + '\'' +
                ", typeTour=" + typeTour +
                ", typeFood=" + typeFood +
                ", typeTransport=" + typeTransport +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return duration == tour.duration &&
                price == tour.price &&
                Objects.equals(name, tour.name) &&
                typeTour == tour.typeTour &&
                typeFood == tour.typeFood &&
                typeTransport == tour.typeTransport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, typeTour, typeFood, typeTransport, duration, price);
    }
}
