package transport;


import validate.ValidateUtils;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Аutomobile {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean isSummerRubber;

    private Key key;
    private Insurance insurance;

    public class Insurance {
        private LocalDate duration;
        private double cost;
        private String number;

        public Insurance(LocalDate duration, double cost, String number) {
            this.duration = duration;
            this.cost = cost;
            this.number = number;
        }


        @Override
        public String toString() {
            return "Insurance{" +
                    "duration=" + duration +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }
    }

    public class Key {
        private final Boolean remoteStart;
        private final Boolean keyLessAccess;


        public Key(Boolean remoteStart, Boolean keyLessAccess) {
            this.remoteStart = ValidateUtils.validateBoolean(remoteStart);
            this.keyLessAccess = ValidateUtils.validateBoolean(keyLessAccess);


        }


        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart=" + remoteStart +
                    ", keyLessAccess=" + keyLessAccess +
                    '}';
        }
    }

    public Аutomobile(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean isSummerRubber) {
        this.brand = validateBrand(brand);
        this.model = validateModel(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.color = validateColor(color);
        this.year = validateYear(year);
        this.country = validateCountry(country);
        this.transmission = validateTransmission(transmission);
        this.bodyType = validateBodyType(bodyType);
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
        this.numberOfSeats = validateNumberOfSeats(numberOfSeats);
        this.isSummerRubber = isSummerRubber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public void setColor(String color) {
        this.color = validateColor(color);
    }

    public void setTransmission(String transmission) {
        this.transmission = validateTransmission(transmission);
    }

    public void setKey(Key key) {
        this.key = key;

    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }


    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
    }

    public void setSummerRubber(boolean summerRubber) {
        isSummerRubber = summerRubber;
    }

    public static String validateBrand(String value) {
        return ValidateUtils.validateString(value, "Некорректное значение");
    }

    public static String validateModel(String value) {
        return ValidateUtils.validateString(value, "Некорректное значение");
    }

    public static double validateEngineVolume(double value) {
        return value <= 0 ? 1.5 : value;
    }

    public static String validateColor(String value) {
        return ValidateUtils.validateString(value, "Белый");
    }

    public static int validateYear(Integer value) {
        return value == null || value <= 0 ? 2000 : value;
    }

    public static String validateCountry(String value) {
        return ValidateUtils.validateString(value, "Россия");
    }

    public static String validateTransmission(String value) {
        return ValidateUtils.validateString(value, "Автомат");
    }

    public static String validateBodyType(String value) {
        return ValidateUtils.validateString(value, "Седан");
    }

    public static double validateCost(double value) {
        return value <= 0 ? 1000 : value;
    }

    public static String validateRegistrationNumber(String number) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", number)) {
            return number;
        } else {
            System.out.println("Номер некорректный");
        }
        return "Неверный номер";
    }

    private static boolean validateSerialNumber(String number) {
        if (Pattern.matches("[а-яА-Яa-zA-Z0-9]{9}", number)) {
            return true;
        } else {
            System.out.println("Некорректный номер");
        }
        return false;
    }

    public static LocalDate checkDuration(LocalDate duration) {
        if (LocalDate.now().isAfter(duration)) {
            System.out.println("Страховка просрочена!");
            return LocalDate.now();
        } else {
            return duration;
        }
    }

    public static int validateNumberOfSeats(int value) {
        return value <= 0 ? 4 : value;
    }


    public String toString() {
        return brand + " " + model + " " + year + " год выпуска, сборка - "
                + country + ", цвет кузова - " + color + ", объем двигателя — " + engineVolume + " л." + transmission + ", "
                + bodyType + ", Количество мест " + registrationNumber + " " + key + " " + insurance;
    }

}

