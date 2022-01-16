package Homework1;

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 2 numbers:");

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();

        System.out.println("Please input number of operation : " + " 1 = sum / " + " 2 = difference /"
                + " 3 = multiplication / " + " 4 = Division");
        int c = scanner.nextInt();


          if (c!=1 && c!=2 && c!=3 && c!=4){
          System.out.println("This is incorrect number of operation! Please input 1,2,3 or 4, nothing else! ");
          return;
        }

        if (c==1){
            float d = a+b;
            System.out.println(a+"+"+b+"="+d);
        }
        if (c==2){
            float d = a-b;
            System.out.println(a+"-"+b+"="+d);
        }
        if (c==3){
            float d = a*b;
            System.out.println(a+"*"+b+"="+d);
        }
        if (c==4){
            float d = a/b;
            System.out.println(a+"/"+b+"="+d);
        }
    }
}
