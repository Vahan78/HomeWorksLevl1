package Day3;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        boolean a = isHeightLowerThen180();
        boolean b = isWightEq50();
        if ((a && b && isAgeGt59()) || (!a && b)) {
            System.out.println(" Positiv");
        } else {
            System.out.println(" Negativ");
        }
    }

        public static boolean isHeightLowerThen180 () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Your height");
            final int height = scanner.nextInt();
            return height < 180;


        }

        public static boolean isAgeGt59 () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Your age:");
            final int age = scanner.nextInt();
            return age < 59;


        }

        public static boolean isWightEq50 () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Yor Wight:");
            final int wight = scanner.nextInt();
            return wight == 50;

        }

    }

