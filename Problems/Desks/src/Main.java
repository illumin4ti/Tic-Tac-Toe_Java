import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int st1 = sc.nextInt();
        final int st2 = sc.nextInt();
        final int st3 = sc.nextInt();

        final int results = st1 / 2 + st1 % 2 + st2 / 2 + st2 % 2 + st3 / 2 + st3 % 2;

        System.out.println(results);

    }
}