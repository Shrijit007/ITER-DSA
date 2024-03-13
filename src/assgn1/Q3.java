package assgn1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int z=n;
        int sum=0,product=1;
        while(n!=0){
            int r=n%10;
            sum+=r;
            product*=r;
            n/=10;
        }
        if(sum==product){
            System.out.println(z + " is a Spy number.");
        }
        else{
            System.out.println("not a spy number.");
        }
    }
}
