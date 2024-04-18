package Practice;

class Main{
    static int x=9;
    static int y=9;
     void calculate(){
         System.out.println(x+y);
    }
}
public class DynamicDispatch extends Main {
    void calculate(){
        System.out.println(x-y);
    }
    public static void main(String[] args) {
        DynamicDispatch ob1 = new DynamicDispatch();
        ob1.calculate();
        Main ob2 = new Main();
        ob2.calculate();
    }
}
