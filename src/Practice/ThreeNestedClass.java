package Practice;

public class ThreeNestedClass {
    int x=10;
    class B{
        int x=20;
        class C{
            int x=30;
            void show(){
                System.out.println("c"+x);
            }
        }
        void show(){
            System.out.println("b"+x);
            new C().show();
        }
    }
    void show(){
        System.out.println("a"+x);
        new B().show();
    }

    public static void main(String[] args) {
        ThreeNestedClass A = new ThreeNestedClass();
        A.show();
    }
}
