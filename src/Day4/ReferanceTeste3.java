package Day4;

public class ReferanceTeste3 {
    public static void main(String[] args) {
        int a= 7;
        int b = 8;

        swap(a, b);
        System.out.println(a+" "+b);

    }
    public static void swap(int a, int b){
        int c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b);
    }
}
