import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner let = new Scanner(System.in);
        String text = let.next();
        String newText = text.replace('a', 'b');
        System.out.println(newText);
    }
}