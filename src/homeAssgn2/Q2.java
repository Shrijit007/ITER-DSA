package homeAssgn2;

import java.util.Scanner;

class Book{
    String BName;
    int BEdition;
    double BPrice;
    Book(String s,int e,double p){
        BName=s;
        BEdition=e;
        BPrice=p;
    }
    void display(){
        System.out.println("Name: "+BName+" Edition: "+BEdition+" Price: "+BPrice);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n=sc.nextInt();
        Book arr[]=new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String s = sc.next();
            System.out.print("Edition: ");
            int e = sc.nextInt();
            System.out.print("Price: ");
            double p = sc.nextDouble();
            arr[i]=new Book(s,e,p);
        }
        for (int i = 0; i < n; i++) {
            arr[i].display();
        }
    }
}
