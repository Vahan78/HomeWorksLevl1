package Day4;

public class ReferenceTest2 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,0};
        int[] array2 = {72,333,0, 77};
        swapArray(array1,array2);
        System.out.println(array1[0]);
        System.out.println(array2[0]);

    }

    public static void swapArray(int[] i, int[] j) {
        int[] c =i;
        i=j;
        j=c;

    }
}


