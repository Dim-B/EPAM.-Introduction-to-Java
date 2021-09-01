package module4.programmingwithclass.aggregationandcomposition.t5;

public enum TypeFood {
    RO("не включено"),
    BB("завтрак"),
    HB("двухразовое"),
    FB("трехразовое"),
    ALL("все включено");

    private String name;

    TypeFood(String type) {
        this.name = type;
    }

    public String getName() {
        return name;
    }

}


