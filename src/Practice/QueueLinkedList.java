package Practice;
import java.util.Scanner;
class NODE {
    protected int regd_no;
    protected float mark;
    protected NODE next;
}
public class QueueLinkedList {
    private NODE front, rear;
    public QueueLinkedList() {
        front = null;
        rear = null;
    }
    public void enqueue() {
        Scanner sc = new Scanner(System.in);
        NODE newNode = new NODE();
        System.out.println("Enter registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.println("Enter marks: ");
        newNode.mark = sc.nextFloat();
        newNode.next = null;
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Node enqueued successfully");
    }
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow: The queue is empty.");
            return;
        }
        NODE temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println("Dequeued node information:\nReg.no - marks");
                System.out.println(temp.regd_no + "--------- " + temp.mark);
    }
    public void peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Front node information:\nReg.no --- marks");
                System.out.println(front.regd_no + "--------- " + front.mark);
    }
    public void isEmpty() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty.");
        }
    }
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        NODE temp = front;
        System.out.println("Queue nodes information:\nReg.no --- marks");
        while (temp != null) {
            System.out.println(temp.regd_no + "--------- " + temp.mark);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n****MENU*****");
            System.out.println("0: Exit");
            System.out.println("1: Enqueue");
            System.out.println("2: Dequeue");
            System.out.println("3: Peek");
            System.out.println("4: Check if Queue is Empty");
            System.out.println("5: Display Queue");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0: System.exit(0);
                case 1: queue.enqueue(); break;
                case 2: queue.dequeue();break;
                case 3: queue.peek();break;
                case 4: queue.isEmpty();break;
                case 5: queue.display();break;
                default: System.out.println("Wrong choice. Please try again.");
            }
        }
    }
}