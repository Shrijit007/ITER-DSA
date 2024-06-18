//write a recursive method to find fibonacci sum

package assgn3;

public class Q10 {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
    public static int fibonacci(int n){
        if(n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
