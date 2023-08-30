import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        Scanner input = new Scanner(System.in);
        System.out.println("Укажите Вашу операционную систему:");
        System.out.println("0. iOS");
        System.out.println("1. Android");
        System.out.print("Введите соответствующий пункт -> ");
        int clientOS;
        clientOS = input.nextInt();
        switch(clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке.\n");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.\n");
                break;
        }

        System.out.println("Задача 2.");
        System.out.print("Введите год выпуска Вашего телефона -> ");
        int yearOfRelease;
        yearOfRelease = input.nextInt();
        if (yearOfRelease < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.\n");
        } else if (yearOfRelease < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.\n");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.\n");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.\n");
        }

        System.out.println("Задача 3.");
        System.out.print("Введите год для проверки на високосность -> ");
        int year;
        year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0 && year > 1584) || (year % 400 == 0 && year > 1584)) {
            System.out.println(year + " год является високосным.\n");
        } else {
            System.out.println(year + " год не является високосным.\n");
        }

        System.out.println("Задача 4.");
        System.out.print("Введите величину расстояния от офиса до адреса доставки -> ");
        int distance = input.nextInt();
        int deliveryTime = 0;
        if(distance <= 20){
            ++deliveryTime;
        }else if(distance <= 60){
            deliveryTime += 2;
        }else if(distance <= 100){
            deliveryTime += 3;
        }
        if(deliveryTime != 0) {
            System.out.println("Потребуется дней: " + deliveryTime + "\n");
        }else{
            System.out.println("Доставки нет.\n");
        }

        System.out.println("Задача 5.");
        System.out.print("Введите номер месяца -> ");
        int month = input.nextInt();
        if(month <= 12){
            switch (month){
                case 1:
                case 2:
                case 12:
                    System.out.println(month + "-й месяц принадлежит к зимнему сезону.\n");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(month + "-й месяц принадлежит к весеннему сезону.\n");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(month + "-й месяц принадлежит к летнему сезону.\n");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(month + "-й месяц принадлежит к осеннему сезону.\n");
                    break;
            }
        }
    }
}