package assgn6;
import java.util.Scanner;

public class PartI {
    public static final int MAX=10;
    public static Scanner sc = new Scanner(System.in);

    public static int push(int S[], int top) {
        if(isFull(top))
            System.out.println("Unable to push more elements onto stack - stack is full!");
        else {
            System.out.print("Enter element to push onto stack: ");
            S[++top] = sc.nextInt();
            System.out.println(S[top] + " successfully pushed onto stack.");
        }
        return top;
    }

    public static int pop(int S[], int top) {
        if(isEmpty(top))
            System.out.println("Unable to pop element off stack - stack is empty!");
        else
            System.out.println("Popping " + S[top--] + " off stack.");
        return top;
    }

    public static void display(int S[],int top) {
        if(isEmpty(top))
            System.out.println("Unable to display stack elements - stack is empty!");
        else {
            System.out.println("Stack elements:");
            while(top >= 0)
                System.out.print(S[top--] + " ");
            System.out.println();
        }
    }

    public static boolean isEmpty(int top) {
        return top == -1;
    }

    public static boolean isFull(int top) {
        return top == MAX - 1;
    }

    public static void main(String args[]) {
        int stack[] = new int[MAX];
        int top = -1;
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
                    top = push(stack,top);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
