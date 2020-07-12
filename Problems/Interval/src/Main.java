import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        if (x > -15 && x <= 12 || x > 14 && x < 17 || x >= 19 && x < Integer.MAX_VALUE) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}