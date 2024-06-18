package Practice;

public class PYQ22q5b {
    public static void reverse(String str,int n){
        if(n==0);
        System.out.print(str.charAt(n-1));
        reverse(str,n-1);
    }

    public static void main(String[] args) {
        reverse("car",3);
    }
}
