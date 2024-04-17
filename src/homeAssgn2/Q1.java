package homeAssgn2;

import java.util.Scanner;

class Commission{
    int sales;
    Commission(int sales){
        this.sales=sales;
    }
    int getCommission(){
        int c;
        if(sales<100) c=2;
        else if (sales>=500||sales<5000) c=5;
        else c=8;
        return c;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sales: ");
        int s = sc.nextInt();
        if(s<0) System.err.print("Invalid input.");
        else {
            Commission c = new Commission(s);
            c.getCommission();
            System.out.println(c.getCommission()+"%"+" of sales: "+ (double)((c.getCommission()*s)/100));
        }
    }
}
