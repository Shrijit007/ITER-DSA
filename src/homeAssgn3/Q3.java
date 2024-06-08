// Recursive method to find binary equivalent of a positive decimal integer
package homeAssgn3;

public class Q3 {
    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return decimalToBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        int number = 13;
        String binaryRepresentation = decimalToBinary(number);
        System.out.println("Binary equivalent of " + number + " is: " + binaryRepresentation);
    }
}

