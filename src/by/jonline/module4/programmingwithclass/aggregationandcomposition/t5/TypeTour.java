package module4.programmingwithclass.aggregationandcomposition.t5;

public enum TypeTour {
    VACATION("отдых"),
    EXCURSION("экскурсия"),
    HEALING("лечение"),
    SHOPPING("шопинг"),
    CRUISE("круиз");

    private String name;

    TypeTour(String type){
        this.name = type;
    }

    public String getName() {
        return name;
    }
}
