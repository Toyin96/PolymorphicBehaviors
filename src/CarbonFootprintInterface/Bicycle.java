package CarbonFootprintInterface;

public class Bicycle implements CarbonFootprint{
    private int numberOfKilometersDriven;

    public Bicycle(int numberOfKilometersDriven) {
        if (numberOfKilometersDriven <= 0){
            throw new IllegalArgumentException("Number of kilometres driven must be greater than 0");
        }
        this.numberOfKilometersDriven = numberOfKilometersDriven;
    }

    @Override
    public double getCarbonFootprint() {

        return numberOfKilometersDriven * 21;
    }

    @Override
    public String toString() {
        return String.format("Bicycle - Your carbon footprint is %.2f%s", getCarbonFootprint(), "g of CO2/year");
    }
}
