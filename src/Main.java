import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");

        checkLeapYear(100);
    }

    public static void task2() {
        System.out.println("Задание 2");

        checkVersion(1, 2022);
    }

    public static void task3() {
        System.out.println("Задание 3");

        int distance = 35;

        if (numberOfDeliveryDays(distance) == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + numberOfDeliveryDays(distance));
        }

    }

    public static void checkLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkVersion(int typeOS, int year) {
        int currentYear = LocalDate.now().getYear();

        if (typeOS == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (typeOS == 0 && year == currentYear) {
            System.out.println("Установите приложение для iOS по ссылке");
        }
        if (typeOS == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (typeOS == 1 && year == currentYear) {
            System.out.println("Установите приложение для Android по ссылке");
        }
    }

    public static int numberOfDeliveryDays(int distance) {
        int amountOfDays = 1;

        if (distance > 20) {
            amountOfDays++;
        }
        if (distance > 60) {
            amountOfDays++;
        }
        if (distance > 100) {
            amountOfDays = 0;
        }

        return amountOfDays;
    }
}