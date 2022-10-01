import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Task1
        int year = 2022;
        leapYearCheck(year);
        //Task2
        int clientDeviceYear = 2022;
        String clientOS = "aNdroId"; //type 'ios' or 'android'
        chooseDistributionKit(clientDeviceYear, clientOS);
        //Task3
        int deliveryDistance = 0;
        int days = estimateDeliveryDays(deliveryDistance);
        System.out.println("Дней доставки: " + days);
    }

    public static void leapYearCheck(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + "  не високосный год");
        }
    }

    public static void chooseDistributionKit(int year, String clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS.equalsIgnoreCase("android")) {
            if (year < currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS.equalsIgnoreCase("ios")) {
            if (year < currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Нет такой OS");
        }
    }

    public static int estimateDeliveryDays(int deliveryDistance) {
        short firstDistance = 20;
        short additionalDistance = 40;
        if (deliveryDistance < 0) {
            throw new RuntimeException("Укажите расстояние в км и чтобы на этот раз больше нуля");
        } else {
            return 1 + (deliveryDistance + firstDistance) / additionalDistance;
        }
    }
}