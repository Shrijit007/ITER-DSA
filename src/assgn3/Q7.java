package assgn3;
public class Q7 {
    public static int factorial(int n){
        if(n==0) return 1;
        int prevNum = factorial(n-1);
        return n*prevNum;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(factorial(n));
    }
}
