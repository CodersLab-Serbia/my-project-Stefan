package pl.coderslab.cflowcontrol;

public class Main05 {
    public static void main(String[] args) {
        int resultFor = 0;
        int resultWhile = 0;
        
        // Using for loop
        for (int i = 1; i <= 10; i++) {
            resultFor += i;
        }
        
        // Using while loop
        int num = 1;
        while (num <= 10) {
            resultWhile += num;
            num++;
        }
        
        System.out.println(resultFor);
        System.out.println(resultWhile);
    }
}

