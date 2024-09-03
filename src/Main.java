import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");

        int year = 2021;
        checkYear((year));


        // Задача 2
        System.out.println("Задача 2");

        checkVersionSystemPhone(1, 2015);


        // Задача 3
        System.out.println("Задача 3");

        int deliveryDistance = calculateDays(95);

    }


    public static void checkYear(int year) {
        if (year >= 1584 && (year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year >= 1584 && (year % 4 != 0)) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println("Високосный год еще не ввели");
        }
    }

    public static void checkVersionSystemPhone(int clientOS1, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS1 == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDays(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (days + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (days + 2));
        } else {
            System.out.println("Доставки нет");
        }
        return days;
    }


}

