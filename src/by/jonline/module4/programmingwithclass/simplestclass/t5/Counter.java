package module4.programmingwithclass.simplestclass.t5;

/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса
 */
public class Counter {
    private int value;
    private int maxValue;
    private int minValue;

    public Counter(int value, int maxValue, int minValue) {
        this.value = value;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    public Counter() {
        this.value = 0;
        this.maxValue = 10;
        this.minValue = -10;
    }

    public boolean increase() {
        if (value < maxValue) {
            value++;
            return true;
        }
        return false;
    }

    public boolean decrease() {
        if (value > minValue) {
            value--;
            return true;
        }
        return false;
    }

    public void showState() {
        System.out.println("Текущее значение счетчика: " + value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                ", maxValue=" + maxValue +
                ", minValue=" + minValue +
                '}';
    }
}
