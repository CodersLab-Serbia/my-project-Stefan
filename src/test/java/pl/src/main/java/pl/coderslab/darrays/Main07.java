package pl.coderslab.darrays;

public class Main07 {
    public static void main(String[] args) {
        double[] temperatures = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
        double sum = 0;
        
        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = temperatures[i] * 1.8 + 32;
            sum += temperatures[i];
        }
        
        double avg = sum / temperatures.length;
        System.out.println("AVERAGE: " + String.format("%.2f", avg));
    }
}

