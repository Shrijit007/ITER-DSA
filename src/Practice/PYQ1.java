package Practice;

public class PYQ1 {
    public static void abc (int n) {
        if(n==0) return;
        abc(n-=2);
        System.out.print(n+" ");
}

    public static void main(String[] args) {
        abc(10);
    }
}
