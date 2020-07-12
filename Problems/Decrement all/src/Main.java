import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int nn1 = n1 - 1;
        int nn2 = n2 - 1;
        int nn3 = n3 - 1;
        int nn4 = n4 - 1;
        System.out.print(nn1 + " ");
        System.out.print(nn2 + " ");
        System.out.print(nn3 + " ");
        System.out.println(nn4);
    }
}