package module4.programmingwithclass.aggregationandcomposition.t3;

import java.util.Arrays;
import java.util.Objects;

/*
3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль  столицу, количество областей, площадь, областные центры.
 */
public class State {
    private String name;
    private City capitalCity;
    private int area;
    private Region[] regions;

    public State(String name, City capitalCity, Region[] regions) {
        this.name = name;
        this.capitalCity = capitalCity;
        this.regions = regions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(City capitalCity) {
        this.capitalCity = capitalCity;
    }

    public int getArea() {
        area = 0;
        for (Region region : regions) {
            area += region.getArea();
        }
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }


    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", capitalCity=" + capitalCity +
                ", area=" + area +
                ", regions=" + Arrays.toString(regions) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return area == state.area &&
                Objects.equals(name, state.name) &&
                Objects.equals(capitalCity, state.capitalCity) &&
                Arrays.equals(regions, state.regions);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, capitalCity, area);
        result = 31 * result + Arrays.hashCode(regions);
        return result;
    }
}
