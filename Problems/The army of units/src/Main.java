import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner army = new Scanner(System.in);
        int armyCount = army.nextInt();
        if (armyCount < 1) {
            System.out.println("no army");
        } else if (armyCount >= 1 && armyCount <= 19) {
            System.out.println("pack");
        } else if (armyCount >= 20 && armyCount <= 249) {
            System.out.println("throng");
        } else if (armyCount >= 250 && armyCount <= 999) {
            System.out.println("zounds");
        } else if (armyCount >= 1000) {
            System.out.println("legion");
        }
    }
}