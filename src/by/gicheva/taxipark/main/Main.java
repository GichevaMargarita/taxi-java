package by.gicheva.taxipark.main;

import by.gicheva.taxipark.creator.TaxiParkCreatorFromFile;
import by.gicheva.taxipark.entity.TaxiPark;
import by.gicheva.taxipark.report.TaxiParkReport;

public class Main {
    public static void main(String[] args) {
        TaxiPark ret = new TaxiParkCreatorFromFile().taxiParkCreator("Friday");
        System.out.println(ret);
        TaxiParkReport report = new TaxiParkReport(ret);
        report.printReport();
        ret.sort();
        report.printReport();
    }
}
