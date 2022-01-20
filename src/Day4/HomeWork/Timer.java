package Day4.HomeWork;

public class Timer {
    public static void main(String[] args) {

        final long start = System.nanoTime();
      //  counter.countPrimes(1000000);
        final long end = System.nanoTime() +1000;

        System.out.println("Took: " + ((end - start) / 1000000) + "ms");
    }
}
