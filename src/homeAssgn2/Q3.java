package homeAssgn2;

import java.util.Scanner;

class Bank{
    String bankName;
    int depositAmount;
    static int totalAmount;
    void setName(String name){
        bankName=name;
    }
    void setAmount(int amt){
        depositAmount=amt;
    }
    void showData(){
        System.out.println("Name:"+bankName+" Deposit:"+depositAmount);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Bank arr[]=new Bank[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Name:");
            String n=sc.next();
            System.out.print("deposit amount:");
            int d=sc.nextInt();
            arr[i]=new Bank();
            arr[i].setName(n);
            arr[i].setAmount(d);
            arr[i].showData();
        }
    }
}
