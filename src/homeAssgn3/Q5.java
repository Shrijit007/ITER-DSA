//Write a recursive Java method that takes a character string s and outputs its reverse. For
//example, the reverse of 'pots&pans' would be 'snap&stop'.

package homeAssgn3;
public class Q5 {
    public static String reverse(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    // Main method to test the reverse method
    public static void main(String[] args) {
        String s = "pots&pans";
        String reversed = reverse(s);
        System.out.println("Original string: " + s);
        System.out.println("Reversed string: " + reversed);
    }
}
