package Homework2;

import java.util.Scanner;

public class ThreeDecimalPlaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input two numbers:");
        float i1 = scanner.nextFloat();
        float i2 = scanner.nextFloat();
        String result1 =String.format("%.3f",i1);     // int i1 = (int)f * 1000    // (cast anel, floaty kam double dardznel int)
        String result2 =String.format("%.3f",i2);     // int i2 = (int)f * 1000
     // System.out.println(result1 + " "+result2);


        if (result1 == result1){                     // i1 == i2 ? System.out.println(" The same") : System.out.println("Different");
            System.out.println(" The same");         //
        }else{                                       //
            System.out.println("Different");         //
        }

    }
}