import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner text = new Scanner(System.in);
        String[] line1 = new String[3];
        for (int i = 0; i < line1.length; i++) {
            String word = text.next();
            line1[i] = word;
        }
        for (int i = 0; i < line1.length; i++) {
            System.out.println(line1[i]);
        }
        String[] line2 = new String[2];
        for (int i = 0; i < line2.length; i++) {
            String word = text.next();
            line2[i] = word;
        }
        for (int i = 0; i <line2.length; i++) {
            System.out.println((line2[i]));
        }
    }
}