package assgn3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of colours: ");
        try{
            int n = sc.nextInt();
            String arr[] = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (NegativeArraySizeException e){
            System.out.println(e);
        }
    }
}
