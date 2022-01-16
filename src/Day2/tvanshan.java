package Day2;

public class tvanshan {
    public static void main(String[] args) {
        int i =97;
    //    int a = i/10;
       // System.out.println(a);
        System.out.println( returnFirstDigit(i)+" "+returnSecondDighit(i));

    }

    public static int returnFirstDigit(int num){
        return num/10;

    }
    public static int returnSecondDighit(int num){
        return num-(num/10 *10);

    }
}
