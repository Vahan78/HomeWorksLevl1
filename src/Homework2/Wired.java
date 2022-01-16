package Homework2;

import java.util.Scanner;

public class Wired {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input number:");
        int a = scanner.nextInt();
            if (a%2==0 & a>20 | a==2 | a==4){
            System.out.println("Note wired");
        }
            else {
                System.out.println("Wired");
            }
    }
}
