import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean asc = true;

        for (int i = 0; i < numbers.length - 1 && asc; i++) {
            if (numbers[i] > numbers[i + 1]) {
                asc = false;
            }
        }

        System.out.println(asc);
    }
}