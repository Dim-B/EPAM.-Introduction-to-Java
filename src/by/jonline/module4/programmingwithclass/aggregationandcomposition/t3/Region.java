package module4.programmingwithclass.aggregationandcomposition.t3;

import java.util.Arrays;
import java.util.Objects;

/*
3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль  столицу, количество областей, площадь, областные центры.
 */
public class Region {
    private String name;
    private City regionCenter;
    private int area;
    private District[] districts;

    public Region(String name, City regionCenter, District[] districts) {
        this.name = name;
        this.regionCenter = regionCenter;
        this.districts = districts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public int getArea() {
        area = 0;
        for (District district : districts) {
            area += district.getArea();
        }
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", regionCenter=" + regionCenter +
                ", area=" + area +
                ", districts=" + Arrays.toString(districts) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return area == region.area &&
                Objects.equals(name, region.name) &&
                Objects.equals(regionCenter, region.regionCenter) &&
                Arrays.equals(districts, region.districts);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, regionCenter, area);
        result = 31 * result + Arrays.hashCode(districts);
        return result;
    }
}
