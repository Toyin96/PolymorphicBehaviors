package CarbonFootprintInterface;

public class Building implements CarbonFootprint{
    private double amountOfKilowattUsedPerYear;
    private int numberOfPeopleInHousehold;


    public Building(double amountOfKilowattUsedPerYear, int numberOfPeopleInHousehold) {

        if (amountOfKilowattUsedPerYear <= 0 || numberOfPeopleInHousehold < 1){
            throw new IllegalArgumentException("You entered an invalid input");
        }
        this.amountOfKilowattUsedPerYear = amountOfKilowattUsedPerYear;
        this.numberOfPeopleInHousehold = numberOfPeopleInHousehold;
    }

    @Override
    public double getCarbonFootprint() {
        return (amountOfKilowattUsedPerYear / numberOfPeopleInHousehold) * 0.6;
    }

    @Override
    public String toString() {
        return String.format("%nBuilding - Your carbon footprint is %.2f%s", getCarbonFootprint(), "kg of CO2e/yr");
    }
}
