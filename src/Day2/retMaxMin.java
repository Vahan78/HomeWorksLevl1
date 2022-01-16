package Day2;

import static Day2.Min.max;

public class retMaxMin {
    public static void main(String[] args) {

        int i1=564;
        int i2=654;
        int i3=6584;
        int i4=6554;
        int i5=68;


        long max = max(max(max(max(i1, i2),i3),i4),i5);
        System.out.println("max="+max);

        long min;
                min= Min.min(i1, i2);
        System.out.println("min=" +min);

    }

    private static void min(int i1, int i2) {
    }
    //   public static int min(int i1,int i2,int i3,int i4,int i5) {
 //       int min = min(min(min(min(i1, i2),i3),i4),i5);
 //   }

 }
