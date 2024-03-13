package assgn1;
public class Q5 {
    public static void main(String[] args) {
        System.out.println("sum of digits less than 10 is: "+sum_Of_Digits(9294));
    }
    public static int sum_Of_Digits(int n) {
        int sum = 0;
        while (n > 10) {
            sum=0;
            while(n!=0){
                int r = n % 10;
                sum += r;
                n/=10;
            }
            n=sum;
        }
        return sum;
    }
}
