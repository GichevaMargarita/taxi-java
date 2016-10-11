package by.gicheva.taxipark.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CargoTaxi extends Auto {
    private int cargoTaxiCapacity;
    private double cargoTaxiMaxLength;
    private double cargoTaxiMaxHeight;
    private static final Logger LOG = LogManager.getLogger();

    public CargoTaxi(String carNumber, double carFuelConsumption, int dollarPrice, int cargoTaxiCapacity, double cargoTaxiMaxLength, double cargoTaxiMaxHeight) {
        super(carNumber, carFuelConsumption, dollarPrice);
        if (cargoTaxiCapacity > 0 && cargoTaxiMaxLength > 0 && cargoTaxiMaxHeight > 0) {
            this.cargoTaxiCapacity = cargoTaxiCapacity;
            this.cargoTaxiMaxLength = cargoTaxiMaxLength;
            this.cargoTaxiMaxHeight = cargoTaxiMaxHeight;
            LOG.info("New Cargo Taxi " + this.getCarNumber() + " Created with " + this.carCharacteristics());
        }
    }

    public int getCargoTaxiCapacity() {
        return cargoTaxiCapacity;
    }

    public void setCargoTaxiCapacity(int cargoTaxiCapacity) {
        this.cargoTaxiCapacity = cargoTaxiCapacity;
    }

    public double getCargoTaxiMaxLength() {
        return cargoTaxiMaxLength;
    }

    public void setCargoTaxiMaxLength(double cargoTaxiMaxLength) {
        this.cargoTaxiMaxLength = cargoTaxiMaxLength;
    }

    public double getCargoTaxiMaxHeight() {
        return cargoTaxiMaxHeight;
    }

    public void setCargoTaxiMaxHeight(double cargoTaxiMaxHeight) {
        this.cargoTaxiMaxHeight = cargoTaxiMaxHeight;
    }

    @Override
    public String toString() {
        return "Cargo Taxi " + this.getCarNumber();
    }

    public String carCharacteristics() {
        return "cargoTaxiCapacity=" + cargoTaxiCapacity +
                ", cargoTaxiMaxLength=" + cargoTaxiMaxLength +
                ", cargoTaxiMaxHeight=" + cargoTaxiMaxHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CargoTaxi cargoTaxi = (CargoTaxi) o;

        if (cargoTaxiCapacity != cargoTaxi.cargoTaxiCapacity) return false;
        if (Double.compare(cargoTaxi.cargoTaxiMaxLength, cargoTaxiMaxLength) != 0) return false;
        return Double.compare(cargoTaxi.cargoTaxiMaxHeight, cargoTaxiMaxHeight) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + cargoTaxiCapacity;
        temp = Double.doubleToLongBits(cargoTaxiMaxLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cargoTaxiMaxHeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
