package CarbonFootprintInterface;

import java.util.ArrayList;

public class CarbonFootprintTest {

    private static Object CarbonFootprint;

    public static void main(String[] args) {
        ArrayList<CarbonFootprint> carbonFootprint = new ArrayList<>();

        Bicycle bicycle = new Bicycle(2);
        Car car = new Car(157, "diesel");
        Building builder = new Building(3700, 2);

        carbonFootprint.add(bicycle);
        carbonFootprint.add(car);
        carbonFootprint.add(builder);

        System.out.println(carbonFootprint.toString());
    }
}
