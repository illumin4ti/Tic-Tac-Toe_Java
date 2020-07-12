import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner num = new Scanner(System.in);
        int len = num.nextInt();
        Integer[] arr = new Integer[len];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num.nextInt();
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
}