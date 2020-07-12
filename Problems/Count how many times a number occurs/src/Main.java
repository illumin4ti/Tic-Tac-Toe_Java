import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        String[] tokens = scanner.nextLine().split(" ");
        String key = scanner.nextLine();

        int count = 0;

        for (String token: tokens) {
            if (token.equals(key)) {
                count++;
            }
        }

        System.out.println(count);
    }
}