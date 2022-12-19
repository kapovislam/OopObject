package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    void refill(String fuel) {
        System.out.println("Автобус будет заправлен " + validateRefill(fuel));
    }
    public static String validateRefill(String value) {
        if (value.equals("petrol") || value.equals("diesel")) {
            return value;
        } else {
            return "diesel";
        }
    }


}
