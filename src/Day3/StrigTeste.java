package Day3;

public class StrigTeste {
    public static void main(String[] args) {
        String s = "1|2|3|4|5|||6";
        int lenght = s.length();
        System.out.println("The lenght is: " + lenght);
        for (int i = 0; i < lenght; i++) {
            if (s.charAt(i) != '|') {
                System.out.println(s.charAt(i));
            }
        }
    }

}
