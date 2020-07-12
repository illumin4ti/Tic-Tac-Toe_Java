import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int nightCost = scanner.nextInt();
        int flyCost = flightCost * 2;
        int nightsNum = duration - 1;
        int hotelCost = nightsNum * nightCost;
        int food = foodCost * duration;
        System.out.println(food + hotelCost + flyCost);
    }
}