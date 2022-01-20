package Day4;

public class WhileTest {
    public static void main(String[] args) {
        long startMillis = System.currentTimeMillis();
        long endMillis = System.currentTimeMillis() +1000;
        long j = 0;

        while (true) {

            if ((System.currentTimeMillis() - startMillis) / 1000 != (System.currentTimeMillis() - endMillis) / 1000) {
                System.out.println(j + " - " + (System.currentTimeMillis() - startMillis) / 1000);

                j = j + 1;


            }
        }
    }
}
