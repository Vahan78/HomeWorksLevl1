package Day2;

public class Min {
    public static void main(String[] args) {
        int i1 = 4;
        int i2 = 6;
        int i3 = 9;
        int i6 = 145;
        int i7 = 154;
        int min = min(i1,i2);
        min = min(min,i3);
        System.out.println(min);
        System.out.println(max(max(max(max(i1,i2),i3),i6),i7));
    }

    public static int min(int a1, int a2) {
        return a1<a2 ? a1:a2;
    }
    public static int max(int a1, int a2){
        return a1>a2 ? a1:a2;
    }
}

