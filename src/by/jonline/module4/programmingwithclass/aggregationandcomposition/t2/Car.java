package module4.programmingwithclass.aggregationandcomposition.t2;

import java.util.Arrays;
import java.util.Objects;

/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
 */
public class Car {
    private String brand;
    private Engine engine;
    private Wheel[] wheels;

    public Car(String brand) {
        this.brand = brand;
        this.engine = new Engine();
        this.wheels = new Wheel[]{new Wheel(), new Wheel(), new Wheel(), new Wheel()};
    }

    public Car() {
        this("Марка автомобиля неизвестна");
    }

    public void drive() {
        engine.launch();

        for (int i = 0; i < wheels.length; i++) {
            if (wheels[i].getPressure() < 2) {
                System.out.println("Ехать невозможно. Колесо №" + (i + 1) + " спущено.");
                return;
            }
        }

        System.out.println("Машина едет.");
    }

    public void stop() {
        engine.turnOff();
        System.out.println("Машина остановлена.");
    }

    public void refuel() {
        engine.setFuelLevel(1);
        System.out.println("Машина заправлена.");
    }

    public void changeWheel(int number) {
        if (number < 0 || number >= wheels.length) {
            System.out.println("В машине нет колеса с указанным номером.");
        } else {
            wheels[number - 1] = new Wheel();
            System.out.println("Колесо №" + number + " замененно.");
        }
    }

    public void printBrand() {
        System.out.println("Марка автомобиля: " + brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(engine, car.engine) &&
                Arrays.equals(wheels, car.wheels);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(brand, engine);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }
}
