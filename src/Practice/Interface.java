package Practice;

interface A{
    int x=9;
}
public class Interface implements A{
    static void display(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        System.out.println(x);
        display();
    }
}
