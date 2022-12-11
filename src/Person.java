public class Person {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public Person(int yearOfBirth, String name, String jobTitle, String town) {
        String defaultValue = "Информация не указана";
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (name == null || name == "") {
            this.name = defaultValue;
        } else {
            this.name = name;
        }
        if (jobTitle == null || jobTitle == "") {
            this.jobTitle = defaultValue;
        } else {
            this.jobTitle = jobTitle;
        }
        if (town == null || town == "") {
            this.town = defaultValue;
        } else {
            this.town = town;
        }

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }

    }

    public void setTown(String town) {
        if (town != null || !town.isEmpty() || !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }

    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + "! Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности - " + jobTitle + ". Будем знакомы!";
    }



}
