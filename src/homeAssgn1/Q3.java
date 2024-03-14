package homeAssgn1;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        System.out.println("enter elements of array a: ");
        for (int j = 0; j < n; j++) {
            a[j]=sc.nextInt();
        }
        System.out.println("enter elements of array b: ");
        for (int i = 0; i < n; i++) {
            b[i]=sc.nextInt();
        }
        System.out.println("Array c formed is: ");
        for (int i = 0; i < n; i++) {
            c[i]=a[i]*b[i];
            System.out.print(c[i]+ " ");
        }
    }
}
