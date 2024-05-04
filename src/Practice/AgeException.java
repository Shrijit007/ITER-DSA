package Practice;

import java.util.Scanner;

class AgeIllegalException extends Exception{
    AgeIllegalException(String msg){
        super(msg);
    }
}
public class AgeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        try {
            if (age < 18)
                throw new AgeIllegalException("You're not eligible for voting.");
            else
                System.out.println("You're eligible.");
        }
        catch (AgeIllegalException e){
            System.err.println(e.getMessage());
        }
    }
}
