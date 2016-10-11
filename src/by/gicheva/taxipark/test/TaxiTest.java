package by.gicheva.taxipark.test;

import by.gicheva.taxipark.creator.TaxiParkCreatorFromFile;
import by.gicheva.taxipark.entity.CargoTaxi;
import by.gicheva.taxipark.entity.MiniBus;
import by.gicheva.taxipark.entity.PassengerTaxi;
import by.gicheva.taxipark.entity.TaxiPark;
import by.gicheva.taxipark.exception.NoSuitableAutoException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.File;

public class TaxiTest {
    @Test
    public void passengerTaxiCreationTest() {
        PassengerTaxi audi = new PassengerTaxi("NP111", 5.0, 10000, 3, false, true);
        assertEquals(audi, new PassengerTaxi("NP111", 5.0, 10000, 3, false, true));
    }

    @Test
    public void cargoTaxiCreationTest() {
        CargoTaxi gaz = new CargoTaxi("OP789", 11.0, 25000, 5000, 4.0, 2.5);
        assertEquals(gaz, new CargoTaxi("OP789", 11.0, 25000, 5000, 4.0, 2.5));
    }

    @Test
    public void miniBusCreationTest() {
        MiniBus mers = new MiniBus("KI896", 10.0, 21000, 20, 300);
        assertEquals(mers, new MiniBus("KI896", 10.0, 21000, 20, 300));
    }

    @Test
    public void inputFileExistTest() {
        String FOLDER = "data/";
        String FILE = "input.txt";
        File file = new File(FOLDER, FILE);
        assertEquals(file.exists(), true);
    }

    @Test
    public void inputIsFileTest() {
        String FOLDER = "data/";
        String FILE = "input.txt";
        File file = new File(FOLDER, FILE);
        assertEquals(file.isFile(), true);
    }

    @Test
    public void totalParkPriceTest() {
        TaxiPark ret = new TaxiParkCreatorFromFile().taxiParkCreator("Friday");
        assertEquals(ret.taxiParkPrice(), 108000);
    }

    @Test
    public void findSuitableTest() {
        TaxiPark ret = new TaxiParkCreatorFromFile().taxiParkCreator("Friday");
        try {
            assertEquals(ret.findSuitable(4, 0).getCarNumber(), "NP111");
            assertEquals(ret.findSuitable(0, 4000).getCarNumber(), "OP789");
        } catch (NoSuitableAutoException e) {

        }
    }

}
