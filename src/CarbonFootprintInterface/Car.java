package CarbonFootprintInterface;

public class Car implements CarbonFootprint{
    private int amountOfFuel;
    private String typeOfFuel;

    public Car(int amountOfFuel, String typeOfFuel) {

        if (amountOfFuel <= 0){
            throw new IllegalArgumentException("You entered an invalid value for the amount/type of fuel");
        }
        this.amountOfFuel = amountOfFuel;
        this.typeOfFuel = typeOfFuel;
    }

    public int getAmountOfFuel() {

        return amountOfFuel;
    }

    public String getTypeOfFuel() {

        return typeOfFuel;
    }


    @Override
    public double getCarbonFootprint() {

        if (typeOfFuel.equals("diesel")) {
            return amountOfFuel * 2.68;
        }
        return amountOfFuel * 2.39;
    }

    @Override
    public String toString() {
        return String.format("%nCar - Your carbon footprint is %.2f%s", getCarbonFootprint(), "g of CO2/year");
    }
}
