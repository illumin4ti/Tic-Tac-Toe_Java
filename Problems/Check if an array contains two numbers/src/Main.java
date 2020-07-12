import java.util.*;

class Main {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        s.nextLine();
        String nums = s.nextLine();
        String toFind = s.nextLine();
        String[] ar = toFind.split(" ");

        System.out.println(nums.contains(toFind) || nums.contains(ar[1] + " " + ar[0]));

    }
}
