import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int year = 2021;
       checkForALeapYear(year);
        //Задача 2
        int clientOs = 0;
        int clientDeviseYear = 2015;
        offerRecommendVersion(clientOs, clientDeviseYear);
        //Задача 3
        int deliveryDistance = 95;
        checkQuantityOfDaysOfDelivery(deliveryDistance);

    }
    public static void checkForALeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");}
    }
        public static void offerRecommendVersion(int clientOs, int clientDeviceYear) {
            int currentYear = LocalDate.now().getYear();
            if (clientOs == 0 && clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOs == 0 && clientDeviceYear == currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOs == 1 && clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOs == 1 && clientDeviceYear == currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        public static void checkQuantityOfDaysOfDelivery(int deliveryDistance){
            int parametersDeliveryDistanceOneDay = 20;
            int parametersDeliveryDistanceTwoDay = 60;
            int parametersDeliveryDistanceThreeDay = 100;
            int deliveryOneDay = 1;
            int deliveryTwoDay = 2;
            int deliveryThreeDay = 3;
            boolean distanceDeliveryOneDay = deliveryDistance < parametersDeliveryDistanceOneDay;
            boolean distanceDeliveryTwoDay = deliveryDistance >= parametersDeliveryDistanceOneDay && deliveryDistance < parametersDeliveryDistanceTwoDay;
            boolean distanceDeliveryThreeDay = deliveryDistance >=parametersDeliveryDistanceTwoDay && deliveryDistance <= parametersDeliveryDistanceThreeDay;
            boolean distanceNotDelivery = deliveryDistance > parametersDeliveryDistanceThreeDay;
            if (distanceDeliveryOneDay){
                System.out.println("Потребуется дней " + deliveryOneDay);
            } else if (distanceDeliveryTwoDay) {
                System.out.println("Потребуется дней " + deliveryTwoDay);
            } else if (distanceDeliveryThreeDay) {
                System.out.println("Потребуется дней " + deliveryThreeDay);
            } else if (distanceNotDelivery) {
                System.out.println("К вам нет доставки");
            }
        }
    }