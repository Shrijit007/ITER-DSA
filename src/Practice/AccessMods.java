package Practice;

class c1{
    public int a=10;
    int b=20;
    protected int c=30;
}
public class AccessMods {
    public static void main(String[] args) {
        c1 c=new c1();
        int y = c.a+c.b+c.c;
        System.out.println(y);
    }
}
