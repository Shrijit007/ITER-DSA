package assgn1;

import java.util.Scanner;
public class Q7singleLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[],max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,c1=0,c2=0,pos1=-1,pos2=-1;
        System.out.println("Enter the array limit");
        int n = sc.nextInt();
        if (n > 0) {
            ar = new int[n];
            System.out.println("Enter the array elements ");
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
            System.out.printf("Maximum:%d Occurrences:%d 1stPosition:%d",max,c1,pos1);
            System.out.printf("\nMinimum:%d Occurrences:%d LastPosition:%d",min,c2,pos2);
        }
        else System.out.println("array size can not be les than 1 ");
    }
}