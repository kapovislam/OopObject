public class Аutomobile {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Аutomobile(String brand, String model, double engineVolume, String color, int year, String country) {
        String defaultValue = "default";
        if (brand == null || brand == "") {
            this.brand = defaultValue;
        } else {
            this.brand = brand;
        }

        if (model == null || model == "") {
            this.model = defaultValue;
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color == "") {
            this.color = "Белый";
        } else {
            this.color = color;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country == "") {
            this.country = defaultValue;
        } else {
            this.country = country;
        }

    }

    public String toString() {
        return brand + " " + model + " " + year + " год выпуска, сборка - " + country + ", цвет кузова - " + color + ", объем двигателя — " + engineVolume + " л.";
    }
}

