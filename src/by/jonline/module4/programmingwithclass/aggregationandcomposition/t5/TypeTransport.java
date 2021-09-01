package module4.programmingwithclass.aggregationandcomposition.t5;

public enum TypeTransport {
    PLANE("самолет"),
    BUS("автобус"),
    TRAIN("поезд"),
    WATER("морской или речной"),
    NONE("без трансфера");

    private String name;

    TypeTransport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
