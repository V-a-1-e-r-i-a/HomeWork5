public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите наше приложение на Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите наше приложение на iOS по ссылк");
        }

        //Задача 2
        System.out.println("Задача 2");
        int clientOS2 = 0;
        int clientDeviceYear = 2021;
        if (clientOS2 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите наше приложение на Android по ссылке");}}
        if (clientOS2 == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите наше приложение на iOS по ссылк");}}
        //Задача 3
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является весокосным");
        } else {
            System.out.println(year + " год не является весокосным");
        }

        //Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
                }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            deliveryDays++;
        }
        System.out.println("Количесвто дней, еоторые понадобятся для доставки: " + deliveryDays);

        //Задача 5
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
    }
}

