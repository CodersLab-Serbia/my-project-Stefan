package pl.coderslab.cflowcontrol;

public class Main02 {
    public static void main(String[] args) {
        int no1 = 3, no2 = 7, no3 = 11;
        
        if (no1 >= no2 && no1 >= no3) {
            System.out.println("The greatest number is " + no1);
        } else if (no2 >= no1 && no2 >= no3) {
            System.out.println("The greatest number is " + no2);
        } else {
            System.out.println("The greatest number is " + no3);
        }
    }
}

