package pl.coderslab.cflowcontrol;

public class Main06 {
    public static void main(String[] args) {
        int n = 6;
        
        // Using for loop
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " - " + (i % 2 == 0 ? "even" : "odd"));
        }
        
        // Using while loop
        int num = 0;
        while (num <= n) {
            System.out.println(num + " - " + (num % 2 == 0 ? "even" : "odd"));
            num++;
        }
    }
}

