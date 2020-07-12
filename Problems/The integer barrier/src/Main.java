import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner suck = new Scanner(System.in);
        int sum = 0;
        while (sum < 1000) {
            int newNum = suck.nextInt();
            sum = sum + newNum;
            if (newNum == 0) {
                System.out.println(sum);
                break;
            }
            if (sum >= 1000) {
                System.out.println(sum - 1000);
            }
        }
    }
}