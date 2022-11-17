public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int clientOS = 1;
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2022;
        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0) ) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год не високосный");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDay = 0;
        if (deliveryDistance < 20) {
            deliveryDay += 1;
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryDay += 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100 ) {
            deliveryDay += 3;
        } else {
            System.out.println("Доставки нет");
        }

        if (deliveryDay == 1) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDay >=2 && deliveryDay<=4) {
            System.out.println("Потребуется дня: " + deliveryDay);
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("1-й месяц принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("2-й месяц принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("3-й месяц принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("4-й месяц принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("5-й месяц принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("6-й месяц принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("7-й месяц принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("8-й месяц принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("9-й месяц принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("10-й месяц принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("11-й месяц принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("12-й месяц принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца нет!");
        }
    }
}