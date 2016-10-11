package by.gicheva.taxipark.creator;

import by.gicheva.taxipark.entity.Auto;
import by.gicheva.taxipark.entity.TaxiPark;
import by.gicheva.taxipark.exception.ParseAutoException;
import by.gicheva.taxipark.parser.ParseAuto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class AutoFactory {
    private static final Logger LOG = LogManager.getLogger();

    public TaxiPark createTaxiPark(String name, List<String> lines) {
        ArrayList<Auto> auto = new ArrayList<>();
        ParseAuto parseAuto = new ParseAuto();
        try {
            for (String line : lines) {
                String[] arr = line.split(" ");
                switch (arr[0]) {
                    case "PT": {
                        auto.add(parseAuto.parsePassengerTaxi(line));
                        break;
                    }
                    case "CT": {
                        auto.add(parseAuto.parseCargoTaxi(line));
                        break;
                    }
                    case "MB": {
                        auto.add(parseAuto.parseMiniBus(line));
                        break;
                    }
                    default: {
                        LOG.error("Wrong input line: " + line);
                    }
                }
            }
        } catch (ParseAutoException e) {
            LOG.error("String was not parsed");
        }
        return new TaxiPark(name, auto);
    }
}
