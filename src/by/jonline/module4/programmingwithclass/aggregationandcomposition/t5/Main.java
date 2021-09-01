package module4.programmingwithclass.aggregationandcomposition.t5;

/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class Main {
    public static void main(String[] args) {
        Choice choice = new Choice();
        Printer printer = new Printer();

        //фильтр по типу
        choice.filterTypeTour(TypeTour.VACATION);
        //фильтр по продолжительности
        choice.filterDuration(8, 12);
        //сортировка по цене
        choice.sortPrice();
        //печать
        printer.printBase(choice.getSelectedTours());
        System.out.println();

        //сброс фильтров
        choice.resetFilters();

        //фильтр по типу
        choice.filterTypeTour(TypeTour.EXCURSION);
        //фильтр по питанию
        choice.filterTypeFood(TypeFood.RO);
        //сортировка по продолжительности
        choice.sortDuration();
        //печать
        printer.printBase(choice.getSelectedTours());

    }
}
