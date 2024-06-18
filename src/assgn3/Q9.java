//write a recursive method to reverse a number

package assgn3;

public class Q9 {
    public static void main(String[] args) {
        reverse(1257);
    }
    public static void reverse(int n){
        if(n < 10){
            System.out.println(n);
            return;
        }
        System.out.print(n%10);
        reverse(n/10);
    }
}
