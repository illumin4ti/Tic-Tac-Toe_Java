import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner num = new Scanner(System.in);
        int len = num.nextInt();
        Integer[] numbers = new Integer[len];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = num.nextInt();
        }
        int check = num.nextInt();
        boolean contain = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == check) {
                contain = true;
            }
        }
        System.out.println(contain);
    }
}