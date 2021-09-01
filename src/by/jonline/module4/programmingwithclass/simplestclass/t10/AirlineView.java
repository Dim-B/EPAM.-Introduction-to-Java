package module4.programmingwithclass.simplestclass.t10;

import java.util.Arrays;

public class AirlineView {
    public void printAirlineInfo(Airline airline) {
        System.out.println("Номер самолета: " + airline.getNumber() +
                ", пункт назначения: " + airline.getDestination() +
                ", время вылета: " + airline.getTime() +
                ", дни вылета: " + Arrays.toString(airline.getDay()) +
                ", тип самолета: " + airline.getAirplaneType());
    }

}
