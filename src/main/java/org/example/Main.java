package org.example;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



public class Main {

    public static class MaxValue {

        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();

            numbers.add(10);
            numbers.add(5);
            numbers.add(23);
            numbers.add(7);
            numbers.add(19);
            numbers.add(2);
            numbers.add(27);
            numbers.add(11);
            numbers.add(9);

            int max = numbers.get(0);
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            System.out.println("Список: " + numbers);
            System.out.println("Максимальное значение: " + max);

        }


        public static class ForExample {

            public static void main(String[] args) {
                String[] daysOfWeek =
                        {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};


                for (String dayOfWeek : daysOfWeek) {
                    System.out.println(dayOfWeek);
                }
            }
        }
    }
}

        /*public static String getDayOfWeek(int day) {
            String dayString;

            switch (day) {
                case 1:
                    dayString = "Понедельник";
                    break;
                case 2:
                    dayString = "Вторник";
                    break;
                case 3:
                    dayString = "Среда";
                    break;
                case 4:
                    dayString = "Четверг";
                    break;
                case 5:
                    dayString = "Пятница";
                    break;
                case 6:
                    dayString = "Суббота";
                    break;
                case 7:
                    dayString = "Воскресенье";
                    break;
                default:
                    dayString = "Некорректный номер дня";

            }
            return dayString;
        }

        public static void main(String[] args) {
            int day = 5;
            String result = getDayOfWeek(day);
            System.out.println(result);
        }


    }
}



    /*public static void main(String[] args) {

        String[] birthdays = new String[10];
        birthdays[0] = "1";
        birthdays[1] = "12";
        birthdays[2] = "123";
        birthdays[3] = "1234";
        birthdays[4] = "12345";
        birthdays[5] = "123456";
        birthdays[6] = "1234567";
        birthdays[7] = "12345678";
        birthdays[8] = "123456789";
        birthdays[9] = "1234567890";

        printLongStrings(birthdays);
    }

    public static void printLongStrings(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            String text = arr[i];
            if (text.length() > 5) {
                System.out.println(text);
            }
        }
    }
*/


