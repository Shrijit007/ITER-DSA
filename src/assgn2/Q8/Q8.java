package assgn2.Q8;

import assgn2.Q8_Sports.Sports;



class Student{
    String name;
    int roll;
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        roll = scanner.nextInt();
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}

class Test extends Student {
    int mark1;
    int mark2;
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mark 1: ");
        mark1 = scanner.nextInt();
        System.out.print("Enter mark 2: ");
        mark2 = scanner.nextInt();
    }

    public void showDetails() {
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}

public class Q8 extends Test implements Sports {
    public static void main(String[] args) {
        Test test = new Test();
        test.inputDetails();
        test.showDetails();
        int grandTotal = test.mark1 + test.mark2 + score1 + score2;
        System.out.println("Grand Total Mark: " + grandTotal);
    }
}
