package assgn1;

import java.util.Scanner;
public class Q7singleLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[],max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,c1=0,c2=0,pos1=-1,pos2=-1;
        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();
        if (n > 0) {
            ar = new int[n];
            System.out.println("Enter elements the array: ");
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
                if (ar[i]>max){
                    max=ar[i];
                    c1=1;
                    pos1=i;
                }
                else if (ar[i]==max)
                    c1++;
                if(ar[i]<min){
                    min=ar[i];
                    c2=1;
                    pos2=i;
                }
                else if(ar[i]==min){
                    c2++;pos2=i;
                }
            }
            System.out.println("Maximum elements of Array is "+max+" and occurs "+c1+" times.");
            System.out.println("Minimum elements of Array is "+min+" and occurs "+c2+" times.");
            System.out.println("First occurrence of maximum elements is at position "+pos1);
            System.out.println("last occurrence of minimum elements is at position "+pos2);
        }
        else System.out.println("array size can not be les than 1 ");
    }
}