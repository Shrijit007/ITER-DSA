package assgn3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lucky number:");
        int n = sc.nextInt();
        try {
            if (n < 0)
                throw new NumberFormatException("Lucky number shouldn't be -ve.");
            else
                System.out.println("Your  lucky number is "+n);
        } catch (NumberFormatException e){
            System.err.println(e.getMessage());
        }
    }
}
