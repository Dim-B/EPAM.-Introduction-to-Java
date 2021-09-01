package module4.programmingwithclass.aggregationandcomposition.t2;

import java.util.Objects;

/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
 */
public class Engine {
    private boolean isLaunch = false;
    private double fuelLevel;


    public Engine(double fuelLevel) {
        this.setFuelLevel(fuelLevel);
    }

    public Engine() {
        this.setFuelLevel(0.5);
    }

    public void launch() {
        if (fuelLevel == 0) {
            System.out.println("Ехать не возможно. Отсутствует топливо.");
        } else {
            isLaunch = true;
            System.out.println("Двигатель запущен.");
        }
    }

    public void turnOff() {
        isLaunch = false;
        System.out.println("Двигатель остановлен.");
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        if (fuelLevel > 1) {
            this.fuelLevel = 1;
        } else if (fuelLevel < 0) {
            this.fuelLevel = 0;
        }
        this.fuelLevel = fuelLevel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "isLaunch=" + isLaunch +
                ", fuelLevel=" + fuelLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return isLaunch == engine.isLaunch &&
                Double.compare(engine.fuelLevel, fuelLevel) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isLaunch, fuelLevel);
    }
}
