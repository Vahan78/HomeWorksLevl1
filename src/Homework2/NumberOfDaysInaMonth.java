package Homework2;

import java.util.Scanner;

public class NumberOfDaysInaMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input a month number");
        int mont = scanner.nextInt();
        if (mont == 2){
            System.out.println("Please, input a year");
            int year = scanner.nextInt();
            if (year%400 == 0 || year%100 != 0 & year%4 == 0) {         // year%400 == 0 || year%100 != 0 & year%4 ==0 ?
                System.out.println("February "+ year+" has 29 days");   // System.out.println("February "+ year+" has 29 days"); :
                                                                        // System.out.println("February "+ year+" has 28 days")
            } else{
                System.out.println("February "+ year+" has 28 days");
            }
        }else if (mont == 4 | mont == 6 | mont == 9 | mont == 11 ){
            System.out.println("This month in every year has 30 days");
        } else {
            System.out.println("This month in every year has 31 days");
        }
    }
}
