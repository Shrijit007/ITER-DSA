package assgn3;

public class Q8 {
    public static double power(double x,int n){
        if(n==0) return 1;
        else if(n<0) return 1/power(x,-n);
        else if(n%2==0) {
            double result = power(x,n/2);
            return result*result;
        }
        else  return x*power(x,n-1);
    }

    public static void main(String[] args) {
        double x = 2.5;
        int n = 3;
        System.out.println(x + " raised to the power of " + n + " is: " + power(x, n));
    }
}
