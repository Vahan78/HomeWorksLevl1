package Day2;

public class m {
    public static void main(String[] args) {
        int i =974;
        int firstDigit = firstDigit(i);
        int secondDigit = secondDigit(i);
        int thirdDighit = thirdDighit(i);
        System.out.println((firstDigit  + " " + secondDigit + " " + thirdDighit));

    }

    public static int firstDigit(int i) {
        return i/100;

    }
    public static int secondDigit(int i){

        return (i - 100 * firstDigit(i))/10;
    }
    public static int thirdDighit(int i){
        return (i%10);
    }
}
