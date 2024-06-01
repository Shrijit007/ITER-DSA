package assgn6;

import java.util.Scanner;

public class PartII {
    static class Node {
        int info;
        Node next;

        Node(int info, Node next) {
            this.info = info;
            this.next = next;
        }
    }

    public static Scanner sc = new Scanner(System.in);

    public static Node push(Node top) {
        System.out.print("Enter element to push onto stack: ");
        Node newNode = new Node(sc.nextInt(), top);
        top = newNode;
        System.out.println(top.info + " successfully pushed onto stack.");
        return top;
    }

    public static Node pop(Node top) {
        if(top==null)
            System.out.println("Unable to pop element off stack - stack is empty!");
        else {
            System.out.println("Popping " + top.info + " off stack.");
            top = top.next;
        }
        return top;
    }

    public static void display(Node top) {
        if(top == null)
            System.out.println("Unable to display stack elements - stack is empty!");
        else {
            Node temp = top;
            System.out.println("Stack elements: ");
            while(temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Node top = null;

        while(true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
