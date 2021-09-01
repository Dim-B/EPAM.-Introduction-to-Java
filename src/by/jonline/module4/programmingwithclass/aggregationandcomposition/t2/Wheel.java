package module4.programmingwithclass.aggregationandcomposition.t2;

import java.util.Objects;

/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
 */
public class Wheel {
    private double pressure;

    public Wheel(double pressure) {
        this.pressure = pressure;
    }

    public Wheel() {
        this.pressure = 2.5;
    }

    public void deflate() {
        this.pressure = 1;
    }

    public void pumpUp() {
        this.pressure = 2.5;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "pressure=" + pressure +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.pressure, pressure) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pressure);
    }
}
