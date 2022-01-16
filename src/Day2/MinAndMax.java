package Day2;

public class MinAndMax {
    public static void main(String[] args) {
        int i1=5;
        int i2=10;
        System.out.println(minAndMax(i1, i2)[0] +"|"+(minAndMax(i1,i2))[1] );

    }
    public static int[] minAndMax(int i, int j){
        int[] array = new int[2];
        if (i<j) {
            array[0] = i;
            array[1] = j;
            return array;
        }
        else {
            array[0]=j;
            array[1]=i;
            return array;
        }
    }
}
