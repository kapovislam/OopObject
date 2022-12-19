package validate;

public class ValidateUtils {
    public static String validateString(String value, String substitution) {
        return (value == null || value.isBlank() || value.isEmpty()) ? substitution : value;
    }

    public static String validateString1(String value) {
        if (value == null || value.isBlank() || value.isEmpty()) {
            System.out.println("Некоректное значение");
        }
        return value;
    }

    public static Integer validateInteger(Integer value, Integer substitution) {
        return (value == null || value <= 0) ? substitution : value;
    }

    public static Boolean validateBoolean(Boolean value) {
        return value == null ? false : value;
    }

}
