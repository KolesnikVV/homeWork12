import java.time.LocalDate;
public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2023;
        calculationLeapYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2023;
        int currentYear = LocalDate.now().getYear();
        calculationApplicationVersionForIOS(clientOS, clientDeviceYear, currentYear);
        calculationApplicationVersionForAndroid(clientOS, clientDeviceYear, currentYear);
    }


    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 10;
        int day = calculationOfDaysForDilivery(deliveryDistance);
        calculationOfDaysForDilivery(deliveryDistance);
        printDiliveryMassege(day);
    }

    public static int calculationOfDaysForDilivery(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance > 20) {
            day++;
        }
        if (deliveryDistance > 60) {
            day++;
        }
        if (deliveryDistance > 100) {
            day++;
        }
//        System.out.println(day);
        return day;
    }

    public static void printDiliveryMassege(int day) {
        if (day < 4) {
            System.out.println("потребуется дней " + day);
        } else {
            System.out.println("Доставка не возможна!");
        }
    }


        public static void calculationApplicationVersionForIOS ( int clientOS, int clientDeviceYear, int currentYear){
            if (clientOS == 0 && clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear == currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        public static void calculationApplicationVersionForAndroid ( int clientOS, int clientDeviceYear, int currentYear)
        {
            if (clientOS == 1 && clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear == currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }


        public static void calculationLeapYear ( int year){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("год " + year + " високосный год");
            } else {
                System.out.println("год " + year + " не високосный год");
            }

        }
    }


