package Day4;

public class ReferenceTest {
    public static void main(String[] args) {
        int[] array = new int [4];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 0;

        changeArray(array);
        System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]);

    }

    public static void changeArray(int[] i) {
        i[1]=897897897;

    }

    public static void testInt() {

        int i = 5;
        int j = increment(i);

        System.out.println(i);
    }

    public static int increment(int i) {
        i = i + 5;
        return i;
    }
}
