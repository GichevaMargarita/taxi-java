package by.gicheva.taxipark.entity;

import by.gicheva.taxipark.comparator.FuelComparator;
import by.gicheva.taxipark.exception.NoSuitableAutoException;

import java.util.ArrayList;

public class TaxiPark {
    private String taxiParkName;
    private ArrayList<Auto> taxiPark = new ArrayList<>();

    public TaxiPark(String name, ArrayList<Auto> taxiPark) {
        this.taxiParkName = name;
        this.taxiPark = taxiPark;
    }

    public int taxiParkPrice() {
        int total = 0;
        for (Auto auto : taxiPark) {
            total += auto.getDollarPrice();
        }
        return total;
    }

    public Auto findSuitable(int passengerNumber, int capacity) throws NoSuitableAutoException {
        if (passengerNumber > 0) {
            for (Auto auto : taxiPark) {
                if (auto instanceof PassengerTaxi && ((PassengerTaxi) auto).getTaxiPassengerNumber() <= passengerNumber) {
                    return auto;
                } else if (auto instanceof MiniBus && ((MiniBus) auto).getMiniBusPassengerNumber() <= passengerNumber) {
                    return auto;
                }
            }
        } else if (capacity > 0) {
            for (Auto auto : taxiPark) {
                if (auto instanceof CargoTaxi && ((CargoTaxi) auto).getCargoTaxiCapacity() >= capacity) {
                    return auto;
                }
            }
        }
        throw new NoSuitableAutoException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxiPark taxiPark1 = (TaxiPark) o;

        if (taxiParkName != null ? !taxiParkName.equals(taxiPark1.taxiParkName) : taxiPark1.taxiParkName != null)
            return false;
        return taxiPark != null ? taxiPark.equals(taxiPark1.taxiPark) : taxiPark1.taxiPark == null;

    }

    @Override
    public int hashCode() {
        int result = taxiParkName != null ? taxiParkName.hashCode() : 0;
        result = 31 * result + (taxiPark != null ? taxiPark.hashCode() : 0);
        return result;
    }

    public int size() {
        return taxiPark.size();
    }

    public boolean isEmpty() {
        return taxiPark.isEmpty();
    }

    public boolean contains(Object o) {
        return taxiPark.contains(o);
    }

    @Override
    public Object clone() {
        return taxiPark.clone();
    }

    public Object[] toArray() {
        return taxiPark.toArray();
    }

    public Auto get(int index) {
        return taxiPark.get(index);
    }

    public boolean add(Auto auto) {
        return taxiPark.add(auto);
    }

    public Auto remove(int index) {
        return taxiPark.remove(index);
    }

    public void sort() {
        taxiPark.sort(new FuelComparator());
    }

    public String getTaxiParkName() {
        return taxiParkName;
    }

    public void setTaxiParkName(String taxiParkName) {
        this.taxiParkName = taxiParkName;
    }

    public ArrayList<Auto> getTaxiPark() {
        return taxiPark;
    }

    public void setTaxiPark(ArrayList<Auto> taxiPark) {
        this.taxiPark = taxiPark;
    }

    @Override
    public String toString() {
        return taxiPark.toString();
    }
}
