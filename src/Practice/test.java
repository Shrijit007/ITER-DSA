package Practice;

public class test {
    public static void show1(int n){
        if(n>0){
            show1(n-1);
            System.out.print(n+" ");
            show1(n-1);
        }
    }

    public static void show(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j*=2) {
                System.out.println(i+" "+j);
            }
        }
    }
    public static void main(String[] args) {
        show(5);
    }
}
