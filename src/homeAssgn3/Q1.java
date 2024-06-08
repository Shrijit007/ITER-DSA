//Write a recursive method in Java to return the greatest common divisor(gcd) of two integers m
//and n, given that in general, gcd(m,n)=gcd(n, m mod n).

package homeAssgn3;

public class Q1 {
        public static int gcd(int m, int n) {
            // Base case: if n is 0, gcd is m
            if (n == 0) {
                return m;
            }
            // Recursive call: gcd(n, m % n)
            return gcd(n, m % n);
        }

        // Main method to test the gcd method
        public static void main(String[] args) {
            int m = 56;
            int n = 98;

            System.out.println("GCD of " + m + " and " + n + " is: " + gcd(m, n));
        }
}