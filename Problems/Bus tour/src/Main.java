import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightOfTheBus = scanner.nextInt();
        int numberOfTheBridge = scanner.nextInt();
        int heightOfTheBridge;
        int i;
        boolean crash = false;
            for (i = 1; i < numberOfTheBridge; i++) {
                heightOfTheBridge = scanner.nextInt();
                if (heightOfTheBus >= heightOfTheBridge) {
                    crash = true;
                    break;
                }
            }
            if (crash) {
                System.out.println("Will crash on bridge " + i);
            } else {
                System.out.println("Will not crash");
        }
    }
}