package Homework2;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleasa input number:");
        int a = scanner.nextInt();

        if (a > 7) {
            a = a % 7;
        }
        switch (a) {
            case (1):
                System.out.println("Monday");
        }
        switch (a) {
            case (2):
                System.out.println("Tuesday");
        }
        switch (a) {
            case (3):
                System.out.println("Wednesday");
        }
        switch (a) {
            case (4):
                System.out.println("Thursday");
        }
        switch (a) {
            case (5):
                System.out.println("Friday");
        }
        switch (a) {
            case (6):
                System.out.println("Saturday");
        }
        switch (a) {
            case (7):
                System.out.println("Sunday");
        }
    }
}
