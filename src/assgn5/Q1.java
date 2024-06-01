package assgn5;

import java.util.Scanner;

public class Q1 {
    static class Node {
        protected int regdNo;
        protected float mark;
        protected Node next;
        protected Node prev;
    }
    static Node start, end;
    static Scanner sc = new Scanner(System.in);


    public static void create() {
        Node n = new Node();
        System.out.println("Enter student information: ");
        n.regdNo = sc.nextInt();
        n.mark = sc.nextFloat();
        n.next = null;
        n.prev = null;
        start = n;
        end = n;

        while(true) {
            System.out.println("Do you want to create more nodes (y/n): ");
            char ch = sc.next().charAt(0);

            if(ch != 'y' && ch != 'Y')
                break;

            n = new Node();
            System.out.println("Enter student information: ");
            n.regdNo = sc.nextInt();
            n.mark = sc.nextFloat();
            n.next = null;
            n.prev = end;
            end.next = n;
            end = n;
        }
    }

    public static void insBeg() {
        Node n = new Node();
        System.out.println("Enter student information: ");
        n.regdNo = sc.nextInt();
        n.mark = sc.nextFloat();
        n.prev = null;
        n.next = start;
        if(start != null)
            start.prev = n;
        start = n;
        if(end == null)
            end = n;
        System.out.println("New student information inserted at the beginning of list.");
    }

    public static void insEnd() {
        Node n = new Node();
        System.out.println("Enter student information: ");
        n.regdNo = sc.nextInt();
        n.mark = sc.nextFloat();
        n.prev = end;
        n.next = null;

        if(end == null)
            start = n;
        else
            end.next = n;

        end = n;
        System.out.println("New student information inserted at the end of list.");
    }

    public static void insAny() {
        System.out.println("Enter position to insert at: ");
        int position = sc.nextInt();

        if(position <= 0 || position > count() + 1)
            System.out.println("Unable to insert node - invalid position!");
        else if(position == 1)
            insBeg();
        else if(position == count() + 1)
            insEnd();
        else {
            Node n = new Node(), t = start;
            System.out.println("Enter student information: ");
            n.regdNo = sc.nextInt();
            n.mark = sc.nextFloat();

            for(int i = 0; i < position - 2; i++)
                t = t.next;
            n.next = t.next;
            n.prev = t;
            n.next.prev = n;
            t.next = n;
        }
    }

    public static void delBeg() {
        if(start == null)
            System.out.println("Unable to remove node - list is empty!");
        else {
            Node t = start;
            start = start.next;
            t.next = null;

            if(end == t)
                end = null;

            if(start != null)
                start.prev = null;
            System.out.println("Removing from list, student with registration number: " + t.regdNo + " and marks: " + t.mark);
        }
    }

    public static void delEnd() {
        if(start == null)
            System.out.println("Unable to remove node - list is empty!");
        else {
            Node t = end;
            end = end.prev;
            t.prev = null;

            if(start == t)
                start = null;

            if(end != null)
                end.next = null;

            System.out.println("Removing from list, student with registration number: " + t.regdNo + " and marks: " + t.mark);
        }
    }

    public static void delAny() {
        if(start == null) {
            System.out.println("Unable to remove node - list is empty!");
            return;
        }

        System.out.println("Enter position to delete node from: ");
        int position = sc.nextInt();

        if(position <= 0 || position > count()) {
            System.out.println("Unable to remove node - invalid position!");
            return;
        }

        Node t = start;

        if(position == 1)
            delBeg();
        else if(position == count())
            delEnd();
        else {
            for(int i = 0; i < position - 1; i++)
                t = t.next;

            t.next.prev = t.prev;
            t.prev.next = t.next;
            t.prev = null;
            t.next = null;

            System.out.println("Removing from list, student with registration number: " + t.regdNo + " and marks: " + t.mark);
        }
    }

    public static void search() {
        if(start == null) {
            System.out.println("Unable to update student mark - list is empty!");
            return;
        }

        System.out.println("Enter registration number of student to update mark: ");
        int r = sc.nextInt();

        Node t = start;

        boolean found = false;
        while(t != null) {
            if(t.regdNo == r) {
                found = true;
                System.out.println("Enter the updated mark of student " + t.regdNo + ": ");
                t.mark = sc.nextFloat();
                System.out.println("Student mark updated");
                break;
            }
            t = t.next;
        }

        if(!found)
            System.out.println("Unable to update student mark - student with registration number " + r + " not found in list!");
    }

    public static void display() {
        if(start == null)
            System.out.println("List is empty");
        else {
            Node temp = start;
            System.out.println("Elements of list: ");
            while(temp != null) {
                System.out.println(temp.regdNo + " " + temp.mark);
                temp = temp.next;
            }
        }
    }

    public static int count() {
        Node t = start;
        int count = 0;

        while(t != null) {
            count++;
            t = t.next;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while(true)
        {
            System.out.println("\nMenu");
            System.out.println(" 1. Create new doubly linked list");
            System.out.println(" 2. Insert at beginning");
            System.out.println(" 3. Insert at end");
            System.out.println(" 4. Insert at position");
            System.out.println(" 5. Remove from beginning");
            System.out.println(" 6. Remove from end");
            System.out.println(" 7. Remove from position");
            System.out.println(" 8. Update mark");
            System.out.println(" 9. Display list");
            System.out.println("10. Exit");
            System.out.print("\nEnter choice: ");

            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    create();
                    break;
                case 2:
                    insBeg();
                    break;
                case 3:
                    insEnd();
                    break;
                case 4:
                    insAny();
                    break;
                case 5:
                    delBeg();
                    break;
                case 6:
                    delEnd();
                    break;
                case 7:
                    delAny();
                    break;
                case 8:
                    search();
                    break;
                case 9:
                    display();
                    break;
                case 10:
                    System.out.println("Terminating program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
