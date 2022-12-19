package transport;


import validate.ValidateUtils;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Аutomobile extends Transport {
    private double engineVolume;
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

    public Аutomobile(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean isSummerRubber) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.transmission = validateTransmission(transmission);
        this.bodyType = validateBodyType(bodyType);
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
        this.numberOfSeats = validateNumberOfSeats(numberOfSeats);
        this.isSummerRubber = isSummerRubber;
        this.key = key;
        this.insurance = insurance;
    }


    public double getEngineVolume() {
        return engineVolume;
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

    public static Integer validateYear(Integer value) {
        return value == null || value <= 0 ? 2000 : value;
    }

    public static String validateCountry(String value) {
        return ValidateUtils.validateString(value, "Россия");
    }

    @Override
    void refill(String fuel) {
        System.out.println("Автомобиль будет заправлен " + validateRefill(fuel));
    }

    public static String validateRefill(String value) {
        if (value.equals("electricity") || value.equals("petrol") || value.equals("diesel")) {
            return value;
        } else {
            return "petrol";
        }
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
        return getBrand() + " " + getModel() + " " + getYear() + " год выпуска, сборка - "
                + getCountry() + ", цвет кузова - " + getColor() + ", объем двигателя — " + engineVolume + " л." + transmission + ", "
                + bodyType + ", Количество мест " + registrationNumber + " " + key + " " + insurance;
    }

}

