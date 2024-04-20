package Practice;

public class OutputQ2 {
    static int a=0;
    public static void main(String args[]){
        for (int i = 3; i > 1; i--) {
            abc(i);
        }
    }
    static void abc(int x){
        int b=0;a=b;
        for (int i = 1; i <=3; i++) {
            a+=x;b+=i;
            System.out.println(a+" "+b);
        }
    }
}
