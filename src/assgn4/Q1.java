package assgn4;

import java.util.Scanner;

class node {
    protected int regd;
    protected float mark;
    protected node next;
}

public class Q1 {
    public static node start = null;

    public static node create(node start) {
        Scanner sc = new Scanner(System.in);
        node p = new node();
        System.out.println("Enter regd number:");
        p.regd = sc.nextInt();
        System.out.println("Enter mark:");
        p.mark = sc.nextFloat();
        p.next = null;
        start = p;
        node q = p;
        System.out.println("Do you want to enter more in list(y/n): ");
        char ch = sc.next().charAt(0);
        while (ch != 'n') {
            p = new node();
            System.out.println("Enter regd number:");
            p.regd = sc.nextInt();
            System.out.println("Enter mark:");
            p.mark = sc.nextFloat();
            p.next = null;
            q.next = p;
            q = p;
            System.out.println("Do you want to enter more in list(y/n): ");
            ch = sc.next().charAt(0);
        }
        System.out.println("Node entered successfully");
        return start;
    }

    public static node InsBeg(node start) {
        Scanner sc = new Scanner(System.in);
        node p = new node();
        System.out.println("Enter regd number:");
        p.regd = sc.nextInt();
        System.out.println("Enter mark:");
        p.mark = sc.nextFloat();
        p.next = start;
        start = p;
        return start;
    }

    public static node InsEnd(node start) {
        Scanner sc = new Scanner(System.in);
        node NewNode = new node();
        System.out.println("Enter regd number:");
        NewNode.regd = sc.nextInt();
        System.out.println("Enter mark:");
        NewNode.mark = sc.nextFloat();
        NewNode.next = null;
        if (start == null) {
            start = NewNode;
            return start;
        }
        node p = start;
        while (p.next != null)
            p = p.next;
        p.next = NewNode;
        System.out.println("Node entered successfully");
        return start;
    }

    public static node InsAny(node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        node NewNode = new node();
        System.out.println("Enter regd number:");
        NewNode.regd = sc.nextInt();
        System.out.println("Enter mark:");
        NewNode.mark = sc.nextFloat();
        if (pos == 1) {
            NewNode.next = start;
            start = NewNode;
        } else {
            node p = start;
            for (int i = 1; i < pos - 1 && p != null; i++) {
                p = p.next;
            }
            if (p == null) {
                System.out.println("Invalid position");
                return start;
            }
            NewNode.next = p.next;
            p.next = NewNode;
        }
        System.out.println("Node inserted successfully");
        return start;
    }

    public static node DelBeg(node start) {
        if (start == null) {
            System.out.println("List is empty");
            return start;
        }
        start = start.next;
        return start;
    }

    public static node DelEnd(node start) {
        if (start == null || start.next == null) {
            start = null;
            return start;
        }
        node p = start;
        while (p.next.next != null)
            p = p.next;
        p.next = null;
        return start;
    }

    public static node DelAny(node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        if (pos == 1) {
            return DelBeg(start);
        }
        node p = start;
        for (int i = 1; i < pos - 1 && p != null; i++) {
            p = p.next;
        }
        if (p == null || p.next == null) {
            System.out.println("Invalid position");
            return start;
        }
        p.next = p.next.next;
        return start;
    }

    public static void search(node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter regd number to search for:");
        int n = sc.nextInt();
        node p = start;
        int pos = 1;
        while (p != null) {
            if (p.regd == n) {
                System.out.println("Enter updated marks:");
                float m = sc.nextFloat();
                p.mark = m;
                System.out.println("Marks updated successfully");
                return;
            }
            p = p.next;
            pos++;
        }
        System.out.println("Regd number not found");
    }

    public static int count(node start) {
        node p = start;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    public static node reverse(node start) {
        node prev = null;
        node curr = start;
        node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        start = prev;
        return start;
    }

    public static void display(node start) {
        node p = start;
        while (p != null) {
            System.out.print(p.regd + "[" + p.mark + "]" + "-->");
            p = p.next;
        }
        System.out.println();
    }

    public static void sort(node start) {
        if (start == null || start.next == null) {
            return;
        }
        node curr;
        node tail = null;
        boolean swapped;
        do {
            swapped = false;
            curr = start;
            while (curr.next != tail) {
                if (curr.mark > curr.next.mark) {
                    float temp = curr.mark;
                    curr.mark = curr.next.mark;
                    curr.next.mark = temp;
                    swapped = true;
                }
                curr = curr.next;
            }
            tail = curr;
        } while (swapped);
        System.out.println("Sorted successfully");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("++++++++MENU++++++++");
            System.out.println("0. Exit");
            System.out.println("1. Create");
            System.out.println("2. Insert at beginning");
            System.out.println("3. Insert at position");
            System.out.println("4. Insert at end");
            System.out.println("5. Delete at beginning");
            System.out.println("6. Delete at position");
            System.out.println("7. Delete at end");
            System.out.println("8. Search");
            System.out.println("9. Count");
            System.out.println("10. Reverse");
            System.out.println("11. Sort");
            System.out.println("12. Display");
            System.out.print("Enter your choice: ");
            int n = sc.nextInt();
            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    start = create(start);
                    break;
                case 2:
                    start = InsBeg(start);
                    break;
                case 3:
                    start = InsAny(start);
                    break;
                case 4:
                    start = InsEnd(start);
                    break;
                case 5:
                    start = DelBeg(start);
                    break;
                case 6:
                    start = DelAny(start);
                    break;
                case 7:
                    start = DelEnd(start);
                    break;
                case 8:
                    search(start);
                    break;
                case 9:
                    int count = count(start);
                    System.out.println("Number of nodes: " + count);
                    break;
                case 10:
                    start = reverse(start);
                    break;
                case 11:
                    sort(start);
                    break;
                case 12:
                    display(start);
                    break;
                default:
                    System.err.println("Invalid choice");
            }
        }
    }
}
