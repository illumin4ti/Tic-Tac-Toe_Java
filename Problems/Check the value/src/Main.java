import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        boolean check = (num < 10) && (num > 0);
        System.out.println(check);
    }
}