package transport;

import validate.ValidateUtils;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;
    private String fuel;


    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = validateBrand(brand);
        this.model = validateModel(model);
        this.year = validateYear(year);
        this.country = validateCountry(country);
        this.color = validateColor(color);
        this.maxSpeed = validateMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }


    public String getCountry() {
        return country;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static String validateColor(String value) {
        return ValidateUtils.validateString(value, "Белый");
    }

    public static String validateBrand(String value) {
        return ValidateUtils.validateString(value, "Некорректное значение");
    }

    public static String validateModel(String value) {
        return ValidateUtils.validateString(value, "Некорректное значение");
    }

    public static Integer validateYear(Integer value) {
        return ValidateUtils.validateInteger(value, 2020);
    }

    public static String validateCountry(String value) {
        return ValidateUtils.validateString(value, "Россия");
    }
    public static int validateMaxSpeed (int value) {
        return ValidateUtils.validateInteger(value, 240);
    }

    abstract void refill(String fuel);

    @Override
    public String toString() {
        return brand + " " + model + " " + year + " год выпуска, сборка - "
                + country + ", цвет кузова - " + color + ", Максимальная скорость " + maxSpeed;
    }
}
