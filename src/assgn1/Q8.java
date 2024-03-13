package assgn1;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns");
        int m= sc.nextInt();
        int n= sc.nextInt();
        System.out.print("Enter elements of 2D-Array: ");
        int arr[][]=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(count%3==0){
                    System.out.println();
            }
                System.out.print(arr[i][j]+" ");
               count++;
            }
        }
    }
}
