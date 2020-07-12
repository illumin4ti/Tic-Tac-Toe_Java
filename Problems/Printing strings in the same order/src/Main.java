import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner text = new Scanner(System.in);
        String[] words = new String[4];
        for (int i = 0; i < words.length; i++) {
            String word = text.next();
            words[i] = word;
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}