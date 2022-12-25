package transport;

import validate.ValidateUtils;

public class Train extends Transport {
    private Integer price;
    private Integer travelTime;
    private String departure;
    private String endingStation;
    private Integer numberOfWagons;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed, Integer price, Integer travelTime, String departure, String endingStation, Integer numberOfWagons) {
        super(brand, model, year, country, color, maxSpeed);
        this.price = validatePrice(price);
        this.travelTime = validateTravelTime(travelTime);
        this.departure = validateDeparture(departure);
        this.endingStation = validateEndingStation(endingStation);
        this.numberOfWagons = validateNumberOfWagons(numberOfWagons);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Integer travelTime) {
        this.travelTime = travelTime;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public Integer getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(Integer numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public static Integer validatePrice(Integer value) {
        return ValidateUtils.validateInteger(value, 150);
    }

    public static Integer validateTravelTime(Integer value) {
        return ValidateUtils.validateInteger(value, 4);
    }

    public static String validateDeparture(String value) {
        return ValidateUtils.validateString(value, "");
    }

    public static String validateEndingStation(String value) {
        return ValidateUtils.validateString(value, "Нальчик");
    }

    public static Integer validateNumberOfWagons(Integer value) {
        return ValidateUtils.validateInteger(value, 4);
    }

    @Override
   public void refill(String fuel) {
        System.out.println("Поезд будет заправлен " + validateRefill(fuel));
    }
    public static String validateRefill(String value) {
        if (value.equals("diesel")) {
            return value;
        } else {
            return "diesel";
        }
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() + " " + getModel() + " " + getYear() + " год выпуска в " + getCountry() + ", Скорость передвижения - "
                + getMaxSpeed() +
                " км/ч, отходит от " + departure + " вокзала и следует до станции " + endingStation +
                ", Цена поездки — " + price + " рублей, в поезде - " + numberOfWagons;
    }


}
