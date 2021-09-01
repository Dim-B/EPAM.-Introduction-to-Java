package module4.programmingwithclass.aggregationandcomposition.t2;

/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Geely");

        //проверяем работоспособность новой машины
        car.drive();
        car.stop();

        //сливаем топливо
        car.getEngine().setFuelLevel(0);
        //спускаем колесо
        car.getWheels()[2].deflate();

        //пробуем ехать
        car.drive();

        //заправляемся
        car.refuel();
        //меняем колесо
        car.changeWheel(3);

        //едем
        car.drive();

        //печатаем марку автомобиля
        car.printBrand();
    }
}
