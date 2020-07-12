import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Scanner time = new Scanner(System.in);
        int hour1 = time.nextInt();
        int minute1 = time.nextInt();
        int second1 = time.nextInt();
        int hour2 = time.nextInt();
        int minute2 = time.nextInt();
        int second2 = time.nextInt();
        hour1 = hour1 * 3600;
        minute1 = minute1 * 60;
        int time1 = hour1 + minute1 + second1;
        hour2 = hour2 * 3600;
        minute2 = minute2 * 60;
        int time2 = hour2 + minute2 + second2;
        System.out.println(time2 - time1);
    }
}