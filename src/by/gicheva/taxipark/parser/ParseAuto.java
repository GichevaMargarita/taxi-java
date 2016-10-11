package by.gicheva.taxipark.parser;

import by.gicheva.taxipark.entity.CargoTaxi;
import by.gicheva.taxipark.entity.MiniBus;
import by.gicheva.taxipark.entity.PassengerTaxi;
import by.gicheva.taxipark.exception.ParseAutoException;

public class ParseAuto {

    public CargoTaxi parseCargoTaxi(String str) throws ParseAutoException {
        String[] splitComponents = str.split(" ");
        if (splitComponents.length == 7) {
            return new CargoTaxi(splitComponents[1], Double.parseDouble(splitComponents[2]),
                    Integer.parseInt(splitComponents[3]), Integer.parseInt(splitComponents[4]),
                    Double.parseDouble(splitComponents[5]), Double.parseDouble(splitComponents[6]));
        } else {
            throw new ParseAutoException();
        }
    }

    public PassengerTaxi parsePassengerTaxi(String str) throws ParseAutoException {
        String[] splitComponents = str.split(" ");
        if (splitComponents.length == 7) {
            return new PassengerTaxi(splitComponents[1], Double.parseDouble(splitComponents[2]),
                    Integer.parseInt(splitComponents[3]), Integer.parseInt(splitComponents[4]),
                    Boolean.parseBoolean(splitComponents[5]), Boolean.parseBoolean(splitComponents[6]));
        } else {
            throw new ParseAutoException();
        }
    }

    public MiniBus parseMiniBus(String str) throws ParseAutoException {
        String[] splitComponents = str.split(" ");
        if (splitComponents.length == 6) {
            System.out.println(splitComponents);
            return new MiniBus(splitComponents[1], Double.parseDouble(splitComponents[2]),
                    Integer.parseInt(splitComponents[3]), Integer.parseInt(splitComponents[4]),
                    Integer.parseInt(splitComponents[5]));
        } else {
            throw new ParseAutoException();
        }
    }

}
