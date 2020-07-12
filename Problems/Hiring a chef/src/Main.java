//put imports you need here
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        int age = scan.nextInt();
        String education = scan.next();
        int yearsOfExperience = scan.nextInt();
        String cuisinePreference = scan.next();
        System.out.print("The form for " + firstName + " is completed. We will contact you if we need a chef that cooks " + cuisinePreference + " dishes.");
    }
}