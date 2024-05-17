package Practice;
import java.util.*;

class Node1 {
    int info;
    Node1 prev;
    Node1 next;
}

public class DoubleLinkedList {
    static Node1 start = null;

    public static void create() {
        Scanner sc = new Scanner(System.in);
        Node1 p = new Node1();
        System.out.println("Enter info");
        p.info = sc.nextInt();
        p.prev = null;
        p.next = null;
        start = p;
        Node1 q = p;
        System.out.println("Do you want to create more number of nodes(y/n)");
        char ch = sc.next().charAt(0);
        while (ch != 'n') {
            p = new Node1();
            System.out.println("Enter info");
            p.info = sc.nextInt();
            p.prev = q;
            p.next = null;
            q.next = p;
            q = p;
            System.out.println("Do you want to create more number of nodes(y/n)");
            ch = sc.next().charAt(0);
        }
    }

    public static void display() {
        Node1 p = start;
        while (p != null) {
            System.out.print(p.info + "-->");
            p = p.next;
        }
    }

    public static void insertNode(int position, int value) {
        Node1 newNode = new Node1();
        newNode.info = value;
        if (position == 1) {
            newNode.next = start;
            newNode.prev = null;
            if (start != null)
                start.prev = newNode;
            start = newNode;
        } else {
            Node1 p = start;
            for (int i = 1; i < position - 1 && p != null; i++) {
                p = p.next;
            }
            if (p == null) {
                System.out.println("Invalid position");
                return;
            }
            newNode.next = p.next;
            newNode.prev = p;
            if (p.next != null)
                p.next.prev = newNode;
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
            if (start != null)
                start.prev = null;
        } else {
            Node1 p = start;
            for (int i = 1; i < position - 1 && p != null; i++) {
                p = p.next;
            }
            if (p == null || p.next == null) {
                System.out.println("Invalid position");
                return;
            }
            p.next = p.next.next;
            if (p.next != null)
                p.next.prev = p;
        }
        System.out.println("Node deleted successfully");
    }

    public static int search(int value) {
        Node1 p = start;
        int position = 1;
        while (p != null) {
            if (p.info == value) {
                return position;
            }
            p = p.next;
            position++;
        }
        return -1;
    }

    public static void reverse() {
        Node1 temp = null;
        Node1 current = start;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            start = temp.prev;
        }
        System.out.println("List reversed successfully");
    }

    public static void bubbleSort() {
        if (start == null || start.next == null) {
            return;
        }
        boolean swapped;
        Node1 current;
        Node1 tail = null;
        do {
            swapped = false;
            current = start;
            while (current.next != tail) {
                if (current.info > current.next.info) {
                    int temp = current.info;
                    current.info = current.next.info;
                    current.next.info = temp;
                    swapped = true;
                }
                current = current.next;
            }
            tail = current;
        } while (swapped);
        System.out.println("List sorted successfully using Bubble Sort");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n****MENU*****");
            System.out.println("0:Exit");
            System.out.println("1:Creation");
            System.out.println("2:Display");
            System.out.println("3:Insertion");
            System.out.println("4:Deletion");
            System.out.println("5:Search");
            System.out.println("6:Reverse");
            System.out.println("7:Bubble Sort");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the choice");
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
                    System.out.println("Enter the position to insert:");
                    int insertPosition = sc.nextInt();
                    System.out.println("Enter the value to insert:");
                    int insertValue = sc.nextInt();
                    insertNode(insertPosition, insertValue);
                    break;
                case 4:
                    System.out.println("Enter the position to delete:");
                    int deletePosition = sc.nextInt();
                    deleteNode(deletePosition);
                    break;
                case 5:
                    System.out.println("Enter the value to search:");
                    int searchValue = sc.nextInt();
                    int result = search(searchValue);
                    if (result != -1) {
                        System.out.println("Value found at position: " + result);
                    } else {
                        System.out.println("Value not found");
                    }
                    break;
                case 6:
                    reverse();
                    break;
                case 7:
                    bubbleSort();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
