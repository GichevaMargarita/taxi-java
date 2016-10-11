package by.gicheva.taxipark.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PassengerTaxi extends Auto {
    private int taxiPassengerNumber;
    private boolean taxiHasBabyChair;
    private boolean taxiHasTerminal;
    private static final Logger LOG = LogManager.getLogger();

    public PassengerTaxi(String carNumber, double carFuelConsumption, int dollarPrice, int taxiPassengerNumber, boolean taxiHasBabyChair, boolean taxiHasTerminal) {
        super(carNumber, carFuelConsumption, dollarPrice);
        if (taxiPassengerNumber > 0) {
            this.taxiPassengerNumber = taxiPassengerNumber;
            this.taxiHasBabyChair = taxiHasBabyChair;
            this.taxiHasTerminal = taxiHasTerminal;
            LOG.info("New Passenger Taxi " + this.getCarNumber() + " Created with " + this.carCharacteristics());
        }
    }

    public int getTaxiPassengerNumber() {
        return taxiPassengerNumber;
    }

    public void setTaxiPassengerNumber(int taxiPassengerNumber) {
        this.taxiPassengerNumber = taxiPassengerNumber;
    }

    public boolean isTaxiHasBabyChair() {
        return taxiHasBabyChair;
    }

    public void setTaxiHasBabyChair(boolean taxiHasBabyChair) {
        this.taxiHasBabyChair = taxiHasBabyChair;
    }

    public boolean isTaxiHasTerminal() {
        return taxiHasTerminal;
    }

    public void setTaxiHasTerminal(boolean taxiHasTerminal) {
        this.taxiHasTerminal = taxiHasTerminal;
    }

    public String carCharacteristics() {
        return "taxiPassengerNumber=" + taxiPassengerNumber +
                ", taxiHasBabyChair=" + taxiHasBabyChair +
                ", taxiHasTerminal=" + taxiHasTerminal;
    }

    @Override
    public String toString() {
        return "Passenger Taxi" + this.getCarNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PassengerTaxi that = (PassengerTaxi) o;

        if (taxiPassengerNumber != that.taxiPassengerNumber) return false;
        if (taxiHasBabyChair != that.taxiHasBabyChair) return false;
        return taxiHasTerminal == that.taxiHasTerminal;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + taxiPassengerNumber;
        result = 31 * result + (taxiHasBabyChair ? 1 : 0);
        result = 31 * result + (taxiHasTerminal ? 1 : 0);
        return result;
    }
}
