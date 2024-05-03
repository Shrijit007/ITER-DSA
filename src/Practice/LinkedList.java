package Practice;
import java.util.*;

class node {
    int info;
    node next;
}
public class LinkedList {
    static node start=null;
    public static void create() {
        Scanner sc=new Scanner(System.in);
        node p=new node();
        System.out.println("Enter info");
        p.info=sc.nextInt();
        p.next=null;
        start=p;
        node q=p;
        System.out.println("Do you want to create more number of nodes(y/n)");
        char ch=sc.next().charAt(0);
        while(ch!='n') {
            p=new node();
            System.out.println("Enter info");
            p.info=sc.nextInt();
            p.next=null;
            q.next=p;
            q=p;
            System.out.println("Do you want to create more number of nodes(y/n)");
            ch=sc.next().charAt(0);
        }
    }
    public static void display() {
        node p=start;
        while(p!=null) {
            System.out.print(p.info+"-->");
            p=p.next;
        }
    }
    public static void main(String[] args) {
        while(true) {
            System.out.println("\n*MENU");
            System.out.println("0:Exit");
            System.out.println("1:Creation");
            System.out.println("2:Display");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the choice");
            int choice=sc.nextInt();
            switch(choice) {
                case 0:
                    System.exit(0);
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                default:
                    System.out.println("Wrong choice");
             }
        }
    }
}