import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sleep = new Scanner(System.in);
        int A = sleep.nextInt();
        int B = sleep.nextInt();
        int H = sleep.nextInt();
        if (H >= A && H <= B) {
            System.out.println("Normal");
        } else if (H < A) {
            System.out.println("Deficiency");
        } else if (H > B) {
            System.out.println("Excess");
        }
    }
}