package assgn1;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns");
        int n= sc.nextInt();
        System.out.print("Enter elements of 2D-Array: ");
        double arr[][]=new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        double sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i][i];
        }
        System.out.println("sum: "+sum);
    }
}
