package module4.programmingwithclass.simplestclass.t7;

public class TriangleCalculator {

    public double getArea(Triangle t) {
        return Math.abs((t.getxB() - t.getxA()) * (t.getyC() - t.getyA()) - (t.getxC() - t.getxA()) * (t.getyB() - t.getyA())) / 2;
    }

    public double getPerimeter(Triangle t) {
        return lengthLine(t.getxA(), t.getyA(), t.getxB(), t.getyB()) + lengthLine(t.getxB(), t.getyB(), t.getxC(), t.getyC()) + lengthLine(t.getxC(), t.getyC(), t.getxA(), t.getyA());
    }

    private static double lengthLine(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public double[] getMedianPoint(Triangle t) {
        return new double[]{(t.getxA() + t.getxB() + t.getxC()) / 3, (t.getyA() + t.getyB() + t.getyC()) / 3};
    }

}
