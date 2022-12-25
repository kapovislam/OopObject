import transport.Bus;
import transport.Train;
import transport.Аutomobile;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        task1();
        System.out.println();
        task2();
        System.out.println();
//        task3();


    }

    private static Flower[] bouquet;

    private static void task3() {
        /**
         * Напишите программу, которая выводит информацию по каждому цветку со всеми данными:
         * названием, страной происхождения, стоимостью и сроком стояния цветка.
         */

        bouquet = new Flower[]{
                new Flower("Роза", "Голландии", 35.59, 3, ""),
                new Flower("Хризантема", "", 15, 5, ""),
                new Flower("Пион ", "Англия", 69.9, 1, " "),
                new Flower("Гипсофила ", "Турция", 19.5, 10, " "),
        };
        getBouquetInformation();
    }

    private static int getMinLifeSpan() {
        Flower day = null;
        int minLifeSpan = (int) Double.POSITIVE_INFINITY;
        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet != null && bouquet[i].getLifeSpan() < minLifeSpan) {
                minLifeSpan = bouquet[i].getLifeSpan();
                day = bouquet[i];
            }
        }
        return day.getLifeSpan();
    }


    private static double calculatorCost() {
        double sum = 0;
        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet != null) {
                sum += bouquet[i].getCost();
            }
        }
        int pay = 10;
        sum = sum + (sum * pay / 100);
        return sum;
    }

    private static void getBouquetInformation() {
        for (int i = 0; i < bouquet.length; i++) {
            System.out.println(bouquet[i].toString());
        }
        System.out.println(calculatorCost());
        System.out.println(getMinLifeSpan());

    }

    private static void task2() {
        /**
         * Напишите программу, которая будет выводить в консоль информацию о каждом автомобиле
         * и все указанные выше характеристики
         */
        Аutomobile lada = new Аutomobile("", "Granta", 2015, "Россия", "желтый", 180, 1.6, "Ручная", "", "к777кк077", 4, true);
        Аutomobile.Key ladaKey = lada.new Key(true, true);
        Аutomobile.Insurance ladaInsurance = lada.new Insurance(LocalDate.of(2023, 6, 25), 2500, "159425663");
        Аutomobile audi = new Аutomobile("Audi ", "A8 50 L TDI quattro", 2021, "Германия", "черный", 260, 2.4, "", "", "а145рт123", 2, true);
        Аutomobile bmw = new Аutomobile("BMW", "Z8", 2021, "", "", 320, 3.5, "", "Седан", "а145кт153", 4, true);
        Аutomobile kia = new Аutomobile("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "", 280, 3.6, "", "", "а153рт177", 4, true);
        Аutomobile hyundai = new Аutomobile("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 240, 1.8, "", "", "а154рт178", 4, true);
        lada.setKey(ladaKey);
        lada.setInsurance(ladaInsurance);
        Train train = new Train("Ласточка", "B-901", 2011, "Россия", "", 301, 3500, 2, "Белорусского", "Минск-Пассажирский", 11);
        Train train1 = new Train("Ленинград", "D-125", 2019, "Россия", "", 270, 1700, 2, "Ленинградского", "Ленинград-Пассажирский", 8);
        Bus bus = new Bus("Mercedes-Ben", "Sprinter", 2018, "Германия", "белый", 180);
        Bus bus1 = new Bus("МАЗ", "МАЗ-232", 2016, "Россия", "желтый", 160);
        Bus bus2 = new Bus("MAN", "Lion’s", 2020, "Германия", "черный", 220);
        System.out.println(bus);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(train);
        System.out.println(train1);
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
        Person dima = new Person(2001, "Владимир", "безработный", "Казань");
        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(dima);
    }
}