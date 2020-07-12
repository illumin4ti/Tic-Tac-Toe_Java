import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner text = new Scanner(System.in);
        String[] words = new String[3];
        for (int i = 0; i < words.length; i++) {
            String word = text.next();
            words[i] = word;
        }
        for (int i = 2; i> -1; i--) {
            System.out.println(words[i]);
        }
    }
}