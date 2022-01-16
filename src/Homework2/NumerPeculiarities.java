package Homework2;

import java.util.Scanner;

public class NumerPeculiarities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input number.");

        float a = scanner.nextFloat();

        System.out.println("Input value: " + a);

        if (a < 0) {
            System.out.println("Negativ number");

        }
        else{
            System.out.println("Positive number");
        }
        if (-1000000 > a | a > 1000000) {
            System.out.println("Large number");
        }
        if (-1<a && a<1){
            System.out.println("Small number");
        }
    }
}