import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner numbers = new Scanner(System.in);
        int numb = numbers.nextInt();
        int sum = 0;
        Integer[] mass = new Integer[numb];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = numbers.nextInt();
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 6 == 0) {
                sum = sum + mass[i];
            }
        }
        System.out.println(sum);
    }
}