import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner grades = new Scanner(System.in);
        int students = grades.nextInt();
        Integer[] gradeMass = new Integer[students];
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        for (int i = 0; i < gradeMass.length; i++) {
            gradeMass[i] = grades.nextInt();
        }
        for (int i = 0; i < gradeMass.length; i ++) {
            if (gradeMass[i] == 5) {
                gradeA++;
            } else if (gradeMass[i] == 4) {
                gradeB++;
            } else if (gradeMass[i] == 3) {
                gradeC++;
            } else if (gradeMass[i] == 2) {
                gradeD++;
            }
        }
        System.out.println(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);
    }
}