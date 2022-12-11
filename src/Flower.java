import validate.ValidateUtils;

public class Flower {
    private String flowerName;
    private String country;
    private double cost;
    private int lifeSpan;
    private String color;


    public Flower(String flowerName, String country, double cost, int lifeSpan, String color) {
        this.flowerName = validateName(flowerName);
        this.country = validateCountry(country);
        this.cost = validateCost(cost);
        this.lifeSpan = validatelifeSpan(lifeSpan);
        this.color = validateColor(color);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public String getColor() {
        return color;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = validateName(flowerName);
    }

    public void setCountry(String country) {
        this.country = validateCountry(country);
    }

    public void setCost(double cost) {
        this.cost = validateCost(cost);
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = validatelifeSpan(lifeSpan);
    }

    public static String validateName(String value) {
        return ValidateUtils.validateString(value, "Тип цветка не указан");
    }

    public static String validateCountry(String value) {
        return ValidateUtils.validateString(value, "Россия");
    }

    public static double validateCost(double value) {
        return value <= 0 ? 1 : value;
    }

    public static int validatelifeSpan(int value) {
        return value <= 0 ? 3 : value;
    }

    public static String validateColor(String value) {
        return ValidateUtils.validateString(value, "Информация отсутствует");
    }


    @Override
    public String toString() {
        return "Название цветка = " + flowerName + ", страна = " + country +
                ", цена = " + cost + ", срок стояния цветка = " + lifeSpan + ", цвет = " + color;
    }
}

