package Homework1;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 3 numbers:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > c) {
            if (a > b) {
                System.out.println("max = " + a);
            } else {
                System.out.println("max = " + b);
            }

        }else
            if (c>b){
    System.out.println("max = " + c);
        }
                else System.out.println("max = " +b);
        }
    }


