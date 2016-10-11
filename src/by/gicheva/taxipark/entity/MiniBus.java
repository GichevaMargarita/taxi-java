package by.gicheva.taxipark.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MiniBus extends Auto {
    private int miniBusPassengerNumber;
    private int miniBusLuggageCapacity;
    private static final Logger LOG = LogManager.getLogger();

    public MiniBus(String carNumber, double carFuelConsumption, int dollarPrice, int miniBusPassengerNumber, int miniBusLuggageCapacity) {
        super(carNumber, carFuelConsumption, dollarPrice);
        if (miniBusLuggageCapacity > 0 && miniBusLuggageCapacity > 0) {
            this.miniBusPassengerNumber = miniBusPassengerNumber;
            this.miniBusLuggageCapacity = miniBusLuggageCapacity;
            LOG.info("New MiniBus " + this.getCarNumber() + " Created with " + this.carCharacteristics());
        }
    }

    public int getMiniBusPassengerNumber() {
        return miniBusPassengerNumber;
    }

    public void setMiniBusPassengerNumber(int miniBusPassengerNumber) {
        this.miniBusPassengerNumber = miniBusPassengerNumber;
    }

    public int getMiniBusLuggageCapacity() {
        return miniBusLuggageCapacity;
    }

    public void setMiniBusLuggageCapacity(int miniBusLuggageCapacity) {
        this.miniBusLuggageCapacity = miniBusLuggageCapacity;
    }

    public String carCharacteristics() {
        return "miniBusPassengerNumber=" + miniBusPassengerNumber +
                ", miniBusLuggageCapacity=" + miniBusLuggageCapacity;
    }

    @Override
    public String toString() {
        return "Minibus " + this.getCarNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MiniBus miniBus = (MiniBus) o;

        if (miniBusPassengerNumber != miniBus.miniBusPassengerNumber) return false;
        return miniBusLuggageCapacity == miniBus.miniBusLuggageCapacity;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + miniBusPassengerNumber;
        result = 31 * result + miniBusLuggageCapacity;
        return result;
    }
}
