//Write a recursive method in Java to find the product of 2 numbers.

package homeAssgn3;

public class Q4{
    public static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b > 0) {
            return a + multiply(a, b - 1);
        }
        if (b < 0) {
            return -multiply(a, -b);
        }
        return 0;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int product = multiply(a, b);
        System.out.println("Product of " + a + " and " + b + " is: " + product);
    }
}

