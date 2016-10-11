package by.gicheva.taxipark.report;

import by.gicheva.taxipark.entity.Auto;
import by.gicheva.taxipark.entity.TaxiPark;

public class TaxiParkReport {
    private TaxiPark taxiPark;

    public TaxiParkReport(TaxiPark taxiPark) {
        this.taxiPark = taxiPark;
    }

    @Override
    public String toString() {
        String report = "TaxiPark '" + taxiPark.getTaxiParkName() + "': \n"
                + "-----------------------" + "\n";
        for (Auto auto : taxiPark.getTaxiPark()) {
            report += auto + "\n";
        }
        return report;
    }

    public void printReport() {
        System.out.println(this);
    }


}
