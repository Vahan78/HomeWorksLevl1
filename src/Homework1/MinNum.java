package Homework1;

import java.util.Arrays;
import java.util.Scanner;

public class MinNum {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please input 3 numbers:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a<b) {
         if(a<c){
             System.out.println("min = " + a);
         }
         else System.out.println("min = " + c);
        }
        else if (b<c){
            System.out.println("min = " + b);
        } else
        System.out.println("min = " + c);
    }
}
