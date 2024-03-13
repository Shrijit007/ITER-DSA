package assgn1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter elements of 2D-Array: ");
        double arr[][] = new double[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of the elements at column 2 is "+sumColumn(arr,2));
    }
    public static double sumColumn(double[][] m, int columnIndex){
        double sum=0;
        for (int i = 0; i < 3; i++) {
            sum+=m[i][columnIndex];
        }
        return sum;
    }
}