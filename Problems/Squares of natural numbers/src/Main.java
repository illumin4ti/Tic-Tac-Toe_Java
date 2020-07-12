import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        int i = 1;
        while (Math.pow(i, 2) <= num) {
            double numb = (Math.pow(i, 2));
            Integer b = (int) numb;
            System.out.println(b);
            i++;
        }
    }
}