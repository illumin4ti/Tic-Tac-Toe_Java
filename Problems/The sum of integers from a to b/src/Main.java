import  java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner nums = new Scanner(System.in);
        int a = nums.nextInt();
        int b = nums.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.print(sum);
    }
}