package module4.programmingwithclass.aggregationandcomposition.t3;

/*
3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль  столицу, количество областей, площадь, областные центры.
 */
public class Main {
    public static void main(String[] args) {
        City city11 = new City("City11");
        District district11 = new District("District 11", city11, 16);

        City city12 = new City("City12");
        District district12 = new District("District 12", city12, 22);

        Region region1 = new Region("Region1", city11, new District[]{district11, district12});


        City city21 = new City("City21");
        District district21 = new District("District 21", city21, 18);

        City city22 = new City("City22");
        District district22 = new District("District 22", city22, 14);

        City city23 = new City("City23");
        District district23 = new District("District 23", city22, 20);

        Region region2 = new Region("Region2", city22, new District[]{district21, district22, district23});


        State state = new State("State1", city22, new Region[]{region1, region2});

        Printer printer = new Printer();

        //столица
        printer.printCapitalCity(state);
        //количество областных центров
        printer.printCountRegions(state);
        //площадь
        printer.printArea(state);
        //список областных центров
        printer.printRegionalCenters(state);
    }
}
