package Homework2;

import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input a, b and c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();



        if(a==0){
            System.out.println("Error! a cannot equal 0!");
            return;
        }
        double d = b*b-4*a*c;                             //diskriminant
        System.out.println("d="+d);


        if (d==0){
            double x=-b/2*a;
            System.out.println("The rooth are "+ x);
        }
        else if (d>0){
            double x = (-b+Math.pow(d,0.5))/(2*a);
            double y = (-b-Math.sqrt(d))/(2*a);
            System.out.println("The roots are "+ x + "and " +y);
        }
        else {

                System.out.println("Sorry, but this equation has no solution");

            }
        }

    }

