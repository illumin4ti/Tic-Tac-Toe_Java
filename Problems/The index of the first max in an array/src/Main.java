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
        int maxIndex = 0;
        int maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}