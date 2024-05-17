package assgn4;

import java.util.Scanner;

class Node
{
    protected int regd_no;
    protected float mark;
    protected Node next;
}
public class Q1 {
    public static Node start=null;
    public static void create(Node start) {
        Scanner sc =new Scanner(System.in);
        Node p = new Node();
        System.out.println("Enter info");
        p.regd_no=sc.nextInt();
        p.mark= sc.nextFloat();
        p.next = null;
        start = p;
        Node q = p;
        System.out.println("Do you want to create more number of nodes(y/n)");
        char ch = sc.next().charAt(0);
        while (ch != 'n') {
            p = new Node();
            System.out.println("Enter info");
            p.regd_no=sc.nextInt();
            p.mark= sc.nextFloat();
            p.next = null;
            q.next = p;
            q = p;
            System.out.println("Do you want to create more number of nodes(y/n)");
            ch = sc.next().charAt(0);
        }
    }
    public static Node InsBeg(Node start){

        return start;
    }
}
