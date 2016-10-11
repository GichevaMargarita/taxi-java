package by.gicheva.taxipark.entity;

public abstract class Auto {
    private String carNumber;
    private double carFuelConsumption;
    private int dollarPrice;

    public Auto() {
    }

    public Auto(String carNumber, double carFuelConsumption, int dollarPrice) {
        if (carFuelConsumption > 0 && dollarPrice > 0) {
            this.carNumber = carNumber;
            this.carFuelConsumption = carFuelConsumption;
            this.dollarPrice = dollarPrice;
        }
    }

    public String carCharacteristics() {
        return "New Auto";
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public double getCarFuelConsumption() {
        return carFuelConsumption;
    }

    public void setCarFuelConsumption(double carFuelConsumption) {
        this.carFuelConsumption = carFuelConsumption;
    }

    public int getDollarPrice() {
        return dollarPrice;
    }

    public void setDollarPrice(int dollarPrice) {
        this.dollarPrice = dollarPrice;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "carNumber='" + carNumber + '\'' +
                ", carFuelConsumption=" + carFuelConsumption +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auto auto = (Auto) o;

        if (Double.compare(auto.carFuelConsumption, carFuelConsumption) != 0) return false;
        return carNumber != null ? carNumber.equals(auto.carNumber) : auto.carNumber == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = carNumber != null ? carNumber.hashCode() : 0;
        temp = Double.doubleToLongBits(carFuelConsumption);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
