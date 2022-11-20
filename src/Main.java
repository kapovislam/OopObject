public class Main {
    public static void main(String[] args) {
//        task1();
        System.out.println();
        task2();


    }

    private static void task2() {
        /**
         * Напишите программу, которая будет выводить в консоль информацию о каждом автомобиле
         * и все указанные выше характеристики
         */
        Аutomobile lada = new Аutomobile("", "Granta", 1.7, "желтый", 2015, "Россия");
        Аutomobile audi = new Аutomobile("Audi ", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Аutomobile bmw = new Аutomobile("BMW", "Z8", 3.0, "черный", 2021, null);
        Аutomobile kia = new Аutomobile("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Аutomobile hyundai = new Аutomobile("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }

    private static void task1() {
        /**
         * Создайте объекты для следующих персон:
         * Напишите программу так, чтобы в консоль выводилось приветственное сообщение
         * в формате: "Привет! Меня зовут… Я из города… Я родился в… году. Будем знакомы!"
         */
        Person maxim = new Person(-1988, "Максим", "бренд-менеджер", "Минск");
        Person anya = new Person(1993, "", "методист образовательных программ", "Москва");
        Person katya = new Person(1992, "Катя", null, "Калининград");
        Person artem = new Person(1995, "Артем", "директор по развитию бизнеса", "");
        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
    }
}