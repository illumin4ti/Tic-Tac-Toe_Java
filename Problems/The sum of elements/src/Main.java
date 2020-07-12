import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = number;
        while (number != 0) {
            number = scanner.nextInt();
            sum = sum + number;
        }

        System.out.println(sum);
    }
}