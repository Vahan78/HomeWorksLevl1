package Homework2;

import java.util.Scanner;

public class TenMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input number.");
        int a = scanner.nextInt();

        for (int i = 1; i<11; i++){
            int b = a * i;
            System.out.println(i+"*"+a+"="+b);
        }

    }
}
