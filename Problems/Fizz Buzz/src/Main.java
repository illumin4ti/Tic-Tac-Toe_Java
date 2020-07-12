import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int len = (b - a) + 1;
        Integer[] numbers = new Integer[len];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = a + i;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (numbers[i] % 3 == 0) {
                System.out.println("Fizz");
            } else if (numbers[i] % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(numbers[i]);
            }
        }
    }
}