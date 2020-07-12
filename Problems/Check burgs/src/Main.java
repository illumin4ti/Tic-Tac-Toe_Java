import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String city = scanner.nextLine();
    boolean end = (city.endsWith("burg"));
    System.out.println(end);
    }
}
