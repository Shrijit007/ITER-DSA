package Practice;

public class NestedClass {
    int Outer_x = 10;
    class Inner{
        void display(){
            System.out.println(Outer_x);
        }
    }
    void test(){
        Inner In = new Inner();
        In.display();
    }

    public static void main(String[] args) {
        NestedClass n1 = new NestedClass();
        NestedClass.Inner in = new NestedClass().new Inner();
        n1.test();
        in.display();
    }
}
