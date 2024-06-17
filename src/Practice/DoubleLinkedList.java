package Practice;
import java.util.Scanner;

class DoublyNode {
    protected int regd_no;
    protected float mark;
    protected DoublyNode next;
    protected DoublyNode prev;
}

public class DoubleLinkedList {
    static DoublyNode start = null,end = null;
    static Scanner sc = new Scanner(System.in);
    public static void create() {
        DoublyNode p = new DoublyNode();
        System.out.println("Enter student information: ");
        p.regd_no = sc.nextInt();
        p.mark = sc.nextFloat();
        p.next = null;
        p.prev = null;
        start = p;
        end = p;
        System.out.println("Do you want to create more nodes (y/n): ");
        char ch = sc.next().charAt(0);
        while (ch != 'n') {
            p = new DoublyNode();
            System.out.println("Enter student information: ");
            p.regd_no = sc.nextInt();
            p.mark = sc.nextFloat();
            p.next = null;
            p.prev = end;
            end.next = p;
            end = p;
            System.out.println("Do you want to create more nodes (y/n): ");
            ch = sc.next().charAt(0);
        }
    }

    public static void display() {
        DoublyNode p = start;
        if (start == null) {
            System.out.println("Empty linked list");
        } else {
            System.out.println("*******Node details********* \nReg.no --- marks");
            while (p != null) {
                System.out.println(p.regd_no + "--------- " + p.mark);
                p = p.next;
            }
        }
    }

    public static void InsBeg() {
        Scanner sc = new Scanner(System.in);
        DoublyNode p = new DoublyNode();
        System.out.println("Enter registration number: ");
        p.regd_no = sc.nextInt();
        System.out.println("Enter marks: ");
        p.mark = sc.nextFloat();
        p.next = start;
        p.prev = null;
        if (start != null) {
            start.prev = p;
        }
        start = p;
    }

    public static void InsEnd() {
        Scanner sc = new Scanner(System.in);
        DoublyNode p = new DoublyNode();
        System.out.println("Enter registration number: ");
        p.regd_no = sc.nextInt();
        System.out.println("Enter marks: ");
        p.mark = sc.nextFloat();
        p.next = null;
        if (start == null) {
            p.prev = null;
            start = p;
        } else {
            DoublyNode q = start;
            while (q.next != null) {
                q = q.next;
            }
            q.next = p;
            p.prev = q;
        }
    }

    public static void InsAny() {
        Scanner sc = new Scanner(System.in);
        DoublyNode p = new DoublyNode();
        System.out.println("Enter the registration number of the new node: ");
        p.regd_no = sc.nextInt();
        System.out.println("Enter marks: ");
        p.mark = sc.nextFloat();
        System.out.println("Enter position of new node: ");
        int pos = sc.nextInt();
        if (pos == 0) {
            System.out.println("Position does not exist in linked list.");
        } else if (start == null || pos == 1) {
            p.next = start;
            p.prev = null;
            if (start != null) {
                start.prev = p;
            }
            start = p;
            System.out.println("Node added at first position.");
        } else {
            DoublyNode q = start;
            for (int i = 1; i < pos - 1 && q != null; i++) {
                q = q.next;
            }
            if (q == null) {
                System.out.println("Position not found, node added at last position.");
                InsEnd();
            } else {
                p.next = q.next;
                if (q.next != null) {
                    q.next.prev = p;
                }
                q.next = p;
                p.prev = q;
                System.out.println("New node added at position " + pos);
            }
        }
    }

    public static void DelBeg() {
        if (start == null) {
            System.out.println("Empty linked list.");
        } else {
            DoublyNode p = start;
            start = start.next;
            if (start != null) {
                start.prev = null;
            }
            System.out.println("Deleted node information\nReg.no --- marks");
            System.out.println(p.regd_no + "--- ------ " + p.mark);
        }
    }

    public static void DelEnd() {
        if (start == null) {
            System.out.println("Empty linked list.");
        } else {
            DoublyNode p = start;
            while (p.next != null) {
                p = p.next;
            }
            if (p.prev != null) {
                p.prev.next = null;
            } else {
                start = null;
            }
            System.out.println("Deleted node information\nReg.no --- marks");
            System.out.println(p.regd_no + "--- ------ " + p.mark);
        }
    }

    public static void DelAny() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position of deleted node: ");
        int pos = sc.nextInt();
        if (start == null) {
            System.out.println("Empty linked list, delete not possible.");
        } else if (pos == 1) {
            DelBeg();
        } else {
            DoublyNode p = start;
            for (int i = 1; i < pos && p != null; i++) {
                p = p.next;
            }
            if (p == null) {
                System.out.println("Position not found, delete not possible.");
            } else {
                if (p.next != null) {
                    p.next.prev = p.prev;
                }
                if (p.prev != null) {
                    p.prev.next = p.next;
                }
                System.out.println("Deleted node information\nReg.no --- marks");
                System.out.println(p.regd_no + "--- ------ " + p.mark);
            }
        }
    }

    public static void search(int regNo) {
        Scanner sc = new Scanner(System.in);
        if (start == null) {
            System.out.println("Empty linked list.");
        } else {
            DoublyNode p = start;
            while (p != null) {
                if (p.regd_no == regNo) {
                    System.out.println("Registration found, enter the updated marks:");
                    p.mark = sc.nextFloat();
                    System.out.println("Marks updated.");
                    return;
                }
                p = p.next;
            }
            System.out.println("Registration number not found.");
        }
    }

    public static void count() {
        int c = 0;
        DoublyNode q = start;
        while (q != null) {
            c++;
            q = q.next;
        }
        System.out.println("Number of nodes present in linked list is " + c);
    }

    public static void reverse() {
        DoublyNode q = start;
        DoublyNode temp = null;
        while (q != null) {
            temp = q.prev;
            q.prev = q.next;
            q.next = temp;
            q = q.prev;
        }
        if (temp != null) {
            start = temp.prev;
        }
        System.out.println("Linked list reversed.");
    }

    public static void sort() {
        if (start == null) {
            System.out.println("Empty linked list.");
            return;
        }
        DoublyNode m = start;
        while (m.next != null) {
            DoublyNode q = start;
            while (q.next != null) {
                if (q.mark > q.next.mark) {
                    // Swap registration number and marks
                    int reg = q.regd_no;
                    float mark = q.mark;
                    q.regd_no = q.next.regd_no;
                    q.mark = q.next.mark;
                    q.next.regd_no = reg;
                    q.next.mark = mark;
                }
                q = q.next;
            }
            m = m.next;
        }
        System.out.println("Linked list sorted based on marks.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert new node at the beginning");
            System.out.println("4: Insert new node at the end");
            System.out.println("5: Insert new node at any position");
            System.out.println("6: Delete a node from first");
            System.out.println("7: Delete a node from last");
            System.out.println("8: Delete a node from any position");
            System.out.println("9: Update marks based on registration number");
            System.out.println("10: Count of linked list");
            System.out.println("11: Sort the linked list based on marks");
            System.out.println("12: Reverse the linked list");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    InsBeg();
                    break;
                case 4:
                    InsEnd();
                    break;
                case 5:
                    InsAny();
                    break;
                case 6:
                    DelBeg();
                    break;
                case 7:
                    DelEnd();
                    break;
                case 8:
                    DelAny();
                    break;
                case 9:
                    System.out.println("Enter the registration number of the node to update marks:");
                    int regNo = sc.nextInt();
                    search(regNo);
                    break;
                case 10:
                    count();
                    break;
                case 11:
                    sort();
                    break;
                case 12:
                    reverse();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
