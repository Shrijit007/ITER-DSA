package assgn3;

import java.util.Scanner;
class MarksOutOfBoundException extends Exception{
    MarksOutOfBoundException(String msg){
        super(msg);
    }
}
public class Student {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name= sc.nextLine();
        System.out.println("Enter marks: ");
        Double mark= sc.nextDouble();
        try{
            if(mark>100){
                throw new MarksOutOfBoundException("Marks couldn't exceed 100");
            }
        } catch (MarksOutOfBoundException e){
            System.out.println(e.getMessage());
        }
    }
}
