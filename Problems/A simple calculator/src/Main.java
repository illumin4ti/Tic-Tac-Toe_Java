import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner cal = new Scanner(System.in);
        long firstNumber = cal.nextLong();
        char operation = cal.next().charAt(0);
        long secondNumber = cal.nextLong();
        switch (operation) {
            case '+':
                System.out.print(firstNumber + secondNumber);
                break;
            case '-':
                System.out.print(firstNumber - secondNumber);
                break;
            case '/':
                if (secondNumber != 0) {
                    System.out.print(firstNumber / secondNumber);
                    break;
                } else {
                    System.out.print("Division by 0!");
                }
                break;
            case '*':
                System.out.print(firstNumber * secondNumber);
                break;
            default:
                System.out.print("Unknown operator");
        }
    }
}