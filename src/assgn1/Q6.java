package assgn1;
public class Q6 {
    public static void main(String[] args) {
        System.out.println("using subs: "+isOdd(5));
        System.out.println("using AND opr: "+ isOddANDopr(5));
    }
    public static boolean isOdd(int n) {
        while(n>=2){
            n-=2;
        }
        return n==1;
    }
    public static boolean isOddANDopr(int n) {
        return (n & 1) == 1;
    }
}
