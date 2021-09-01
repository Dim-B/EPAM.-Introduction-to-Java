package module4.programmingwithclass.aggregationandcomposition.t3;

/*
3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль  столицу, количество областей, площадь, областные центры.
 */
public class Printer {

    public void printCapitalCity(State state) {
        System.out.println("Столица: " + state.getCapitalCity().getName());
    }

    public void printCountRegions(State state) {
        System.out.println("Количество областей: " + state.getRegions().length);
    }

    public void printArea(State state) {
        System.out.println("Площать государства: " + state.getArea());
    }

    public void printRegionalCenters(State state) {
        StringBuilder result = new StringBuilder();
        Region[] regions = state.getRegions();

        result.append("Областные центры: ");

        for (int i = 0; i < regions.length; i++) {
            result.append(regions[i].getRegionCenter().getName());
            if (i < regions.length - 1) {
                result.append(", ");
            }
        }

        System.out.println(result);
    }

}
