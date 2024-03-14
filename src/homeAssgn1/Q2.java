package homeAssgn1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many lines you want to enter: ");
        int n = sc.nextInt();
        n++;
        String[]str= new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i]=sc.nextLine();
        }
        System.out.println("in reverse: ");
        for (int i = str.length-1; i >=0 ; i--) {
            System.out.println(str[i]);
        }
    }
}