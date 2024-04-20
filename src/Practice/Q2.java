package Practice;
class a{
    final int a=abc();
    protected  int abc(){
        return 10;
        System.out.println("hi");
    }
}
public class Q2 {
    public static void main(String[] args) {
        a ob=new a();
        System.out.println(ob.a);
    }
}
