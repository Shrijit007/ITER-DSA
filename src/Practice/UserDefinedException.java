package Practice;

import java.awt.*;
import java.util.Scanner;

class FailException extends Exception{
    FailException(String msg){
        super(msg);
    }
}
public class UserDefinedException {
    public static final String GREEN = "\u001B[32m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        try {
            if (mark < 10)
                throw new FailException("You Failed :(");
            else
                System.out.println(GREEN+"You passed :)");
        }   catch(FailException e){
            System.err.println(e.getMessage());
        }
    }
}
