import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputcheck = false;
        int nsquare = scanner.nextInt();
        if (nsquare == 0 || nsquare >= 10) {
            inputcheck = false;
        } else {
            inputcheck = true;
        }
        int size = nsquare * nsquare;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 0 || matrix[i][j] > size) {
                    break;
                }
            }
        }
        boolean log = false;
        int x = 0;
        for (int i = 0; i < size; i++) {
            x = x + matrix[0][i];
        }
        int sum = 0;
        for (int i = 0; i < nsquare; i++) {
            for (int j = 0; j < nsquare; j++) {
                sum = sum + matrix[i][j];
            }
        }
        if (sum == x) {
            log = true;
        } else {
            log = false;
        }

        for (int i = 0; i < size; i++) {
            Arrays.sort(matrix[i]);
        }
        boolean isSudoku = false;
        for (int i = 0; i < size; i++) {
            int prev = 0;
            if (matrix[i][0] != 1) {
                isSudoku = false;
                break;
            }
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == prev + 1) {
                    isSudoku = true;
                    prev = matrix[i][j];
                } else {
                    isSudoku = false;
                    break;
                }
            }
        }
        if (isSudoku & log & inputcheck) {
            System.out.println();
            System.out.println("YES");
        } else {
            System.out.println();
            System.out.println("NO");
        }

    }
}