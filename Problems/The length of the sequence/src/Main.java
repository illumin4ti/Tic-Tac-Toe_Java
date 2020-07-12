import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner numbs = new Scanner(System.in);
        int number = numbs.nextInt();
        int count = 0;
        while (number != 0) {
            number = numbs.nextInt();
            count++;
        }
        System.out.println(count);
    }
}