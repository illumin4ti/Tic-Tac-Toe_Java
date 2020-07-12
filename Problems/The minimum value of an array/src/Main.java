import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        Integer[] xyu = new Integer[n];
        for (int i = 0; i < xyu.length; i++) {
            xyu[i] = num.nextInt();
        }
        int min = xyu[0];
        for (int i = 0; i < xyu.length; i++) {
            if (xyu[i] < min) {
                min = xyu[i];
            }
        }
        System.out.print(min);
    }
}