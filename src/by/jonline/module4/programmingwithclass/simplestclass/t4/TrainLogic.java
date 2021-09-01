package module4.programmingwithclass.simplestclass.t4;

public class TrainLogic {

    public Train getTrainInfo(Train[] trains, int number) {
        for (Train t : trains) {
            if (t.getTrainNumber() == number) {
                return t;
            }
        }
        return null;
    }

    public Train[] sortByNumber(Train[] trains) {
        Train tmp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = 0; j < trains.length - i - 1; j++) {
                if (trains[j].getTrainNumber() > trains[j + 1].getTrainNumber()) {
                    tmp = trains[j];
                    trains[j] = trains[j + 1];
                    trains[j + 1] = tmp;
                }
            }
        }
        return trains;
    }

    public Train[] sortByDestination(Train[] trains) {
        Train tmp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = 0; j < trains.length - i - 1; j++) {
                if (trains[j].getDestinationName().compareTo(trains[j + 1].getDestinationName()) > 0) {
                    tmp = trains[j];
                    trains[j] = trains[j + 1];
                    trains[j + 1] = tmp;
                } else if (trains[j].getDestinationName().compareTo(trains[j + 1].getDestinationName()) == 0) {
                    if (trains[j].getDepartureTime().compareTo(trains[j + 1].getDepartureTime()) > 0) {
                        tmp = trains[j];
                        trains[j] = trains[j + 1];
                        trains[j + 1] = tmp;
                    }
                }
            }
        }
        return trains;
    }


}
