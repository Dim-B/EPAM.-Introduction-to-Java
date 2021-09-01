package module4.programmingwithclass.simplestclass.t7;


/*
7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.
 */
public class Triangle {
    private double xA;
    private double yA;
    private double xB;
    private double yB;
    private double xC;
    private double yC;

    public Triangle(double xA, double yA, double xB, double yB, double xC, double yC) {
        this.xA = xA;
        this.yA = yA;
        this.xB = xB;
        this.yB = yB;
        this.xC = xC;
        this.yC = yC;
    }

    public static Triangle getRandomTriangle() {
        return new Triangle(
                Math.random() + 21 - 10,
                Math.random() + 21 - 10,
                Math.random() + 21 - 10,
                Math.random() + 21 - 10,
                Math.random() + 21 - 10,
                Math.random() + 21 - 10);
    }

    public double getxA() {
        return xA;
    }

    public void setxA(double xA) {
        this.xA = xA;
    }

    public double getyA() {
        return yA;
    }

    public void setyA(double yA) {
        this.yA = yA;
    }

    public double getxB() {
        return xB;
    }

    public void setxB(double xB) {
        this.xB = xB;
    }

    public double getyB() {
        return yB;
    }

    public void setyB(double yB) {
        this.yB = yB;
    }

    public double getxC() {
        return xC;
    }

    public void setxC(double xC) {
        this.xC = xC;
    }

    public double getyC() {
        return yC;
    }

    public void setyC(double yC) {
        this.yC = yC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "xA=" + xA +
                ", yA=" + yA +
                ", xB=" + xB +
                ", yB=" + yB +
                ", xC=" + xC +
                ", yC=" + yC +
                '}';
    }
}
