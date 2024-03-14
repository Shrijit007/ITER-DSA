package homeAssgn1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.print("a+b=c ? ");
        if (a+b==c)
            System.out.println("True");
        else System.out.println("False");
        System.out.print("b-c==a ? ");
        if(b-c==a)
            System.out.println("True");
        else System.out.println("False");
        System.out.print("ab=c ? ");
        if (a*b==c)
            System.out.println("True");
        else System.out.println("False");
    }
}
