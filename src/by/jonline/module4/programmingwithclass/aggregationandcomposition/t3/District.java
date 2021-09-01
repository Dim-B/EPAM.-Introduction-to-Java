package module4.programmingwithclass.aggregationandcomposition.t3;

import java.util.Objects;

/*
3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль  столицу, количество областей, площадь, областные центры.
 */
public class District {
    private String name;
    private City districtCenter;
    private int area;

    public District(String name, City districtCenter, int area) {
        this.name = name;
        this.districtCenter = districtCenter;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", districtCenter=" + districtCenter +
                ", area=" + area +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return area == district.area &&
                Objects.equals(name, district.name) &&
                Objects.equals(districtCenter, district.districtCenter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, districtCenter, area);
    }
}
