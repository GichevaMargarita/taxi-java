package by.gicheva.taxipark.creator;

import by.gicheva.taxipark.entity.TaxiPark;
import by.gicheva.taxipark.exception.NoInputFileException;
import by.gicheva.taxipark.reader.ReadFileToList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class TaxiParkCreatorFromFile {
    private static final Logger LOG = LogManager.getLogger();
    private final String FOLDER = "data/";
    private final String FILE = "input.txt";

    public TaxiPark taxiParkCreator(String parkName) {
        try {
            ReadFileToList read = new ReadFileToList();
            List<String> inputLines = read.readFileToList(FOLDER, FILE);
            AutoFactory autoFactory = new AutoFactory();
            LOG.info("New TaxiPark " + parkName + " was created.");
            return autoFactory.createTaxiPark(parkName, inputLines);
        } catch (NoInputFileException e) {
            LOG.fatal("Input File was not found.");
            throw new RuntimeException(e);
        }
    }

}

