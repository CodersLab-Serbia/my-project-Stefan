package pl.coderslab.Prework.cflowcontrol;

public class Main10 {
    public static void main(String[] args) {
        int n = 5;
        // Upper half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print((j + 1) + " ");
                }
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print((j + 1) + " ");
                }
            }
            System.out.println();
        }
    }
}

