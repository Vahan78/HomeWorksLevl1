package Day3;

import java.util.Scanner;

public class Mine {
    public static void main(String[] args) {
        int mines[] = new int[6];

        for (int i = 0; i <3; i++) {
            System.out.println("Is there a mine at"+i);
            final Scanner scanner = new Scanner(System.in);
            if (scanner.nextInt() == 1) {
                mines[i] = 1;
            }
        }
        System.out.println(" Where do you want to stand");
        Scanner scanner = new Scanner(System.in);
        int standIndex = scanner.nextInt();
        if (mines[standIndex] == 1) {
            System.out.println("Booom!");

        } else {
            System.out.println("You are alive");
        }

    }
}
