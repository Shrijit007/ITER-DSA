package homeAssgn1;
import java.util.Arrays;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns");
        int m= sc.nextInt();
        int n= sc.nextInt();
        System.out.print("Enter elements of 2D-Array: ");
        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j]= sc.nextInt();
            }
        }
        double b[][]=new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(addMatrix(a, b)));
    }
    public static double[][] addMatrix(double[][] a, double[][] b){
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions.");
        }
        double [][]c=new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        return c;
    }
}
