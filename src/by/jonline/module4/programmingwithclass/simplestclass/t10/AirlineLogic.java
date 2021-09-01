package module4.programmingwithclass.simplestclass.t10;

public class AirlineLogic {
    Airport airport = Airport.getInstance();
    Airline[] airlines = airport.getAirlines();
    AirlineView view = new AirlineView();

    public void printAirlineByDestination(String destination) {
        for (Airline airline : airlines) {
            if (airline.getDestination().equals(destination)) {
                view.printAirlineInfo(airline);
            }
        }
    }

    public void printAirlineByDay(String day) {
        for (Airline airline : airlines) {
            for (String d : airline.getDay()) {
                if (d.equals(day)) {
                    view.printAirlineInfo(airline);
                }
            }
        }
    }

    public void printAirlineByDayAndTime(String day, String time) {
        for (Airline airline : airlines) {
            for (String d : airline.getDay()) {
                if (d.equals(day) && airline.getTime().compareTo(time) > 0) {
                    view.printAirlineInfo(airline);
                }
            }
        }
    }

}
