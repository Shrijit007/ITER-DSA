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

    }    public static void insertNode(int position, int value) {
        node newNode = new node();
        newNode.info = value;
        if (position == 1) {
            newNode.next = start;
            start = newNode;
        } else {
            node p = start;
            for (int i = 1; i < position - 1 && p != null; i++) {
                p = p.next;
            }
            if (p == null) {
                System.out.println("Invalid position");
                return;
            }
            newNode.next = p.next;
            p.next = newNode;
        }
        System.out.println("Node inserted successfully");
    }

    public static void deleteNode(int position) {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 1) {
            start = start.next;
        } else {
            node p = start;
            for (int i = 1; i < position - 1 && p != null; i++) {
                p = p.next;
            }
            if (p == null || p.next == null) {
                System.out.println("Invalid position");
                return;
            }
            p.next = p.next.next;
        }
        System.out.println("Node deleted successfully");
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
                case 3:
                    System.out.println("Enter position & value: ");
                    int pos= sc.nextInt();
                    int val=sc.nextInt();
                    insertNode(pos,val);
                    break;
                case 4:
                    System.out.println("Enter position: ");
                    int pos1= sc.nextInt();
                    deleteNode(pos1);
                    break;
                default:
                    System.out.println("Wrong choice");
             }
        }
    }
}