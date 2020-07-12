import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        char j = text.charAt(0);
        char prefix = Character.toUpperCase(j);
        char truePrefix = 'J';
        boolean prefixCheck = (prefix == truePrefix);
        System.out.println(prefixCheck);
    }
}
