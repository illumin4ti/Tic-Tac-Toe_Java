class Main {
    public static void main(String[] args) {
        // put your code here
        for (int i = 0; i <= 8; i++) {
            if (i == 8) {
                System.out.println("");
            } else {
                System.out.print("*");
            }
        }
        for (int j = 0; j < 3; j++) {
            System.out.println("      **");
        }
        for (int k = 0; k < 2; k++) {
            System.out.println("**    **");
        }
        for (int l = 0; l < 8; l++) {
            if (l == 0) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println("");
    }
}