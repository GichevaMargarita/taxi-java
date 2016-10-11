package by.gicheva.taxipark.comparator;

import by.gicheva.taxipark.entity.Auto;

import java.util.Comparator;

public class FuelComparator implements Comparator<Auto> {
    @Override
    public int compare(Auto a, Auto b) {
        if (a.getCarFuelConsumption() == b.getCarFuelConsumption()) {
            return 0;
        } else if (a.getCarFuelConsumption() > b.getCarFuelConsumption()) {
            return 1;
        } else {
            return -1;
        }
    }

}
