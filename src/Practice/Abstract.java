package Practice;

abstract class AB{
    AB(int x , int y){
        this.x=x;
        this.y=y;
    }
    int x;
    int y;
    abstract void display();
    void mark(){
        System.out.println(x+y);
    }
}
public class Abstract extends AB{
    Abstract(int x, int y) {
        super(x, y);
    }
    void display() {
        System.out.println(x-y);
    }
    public static void main(String[] args) {
        AB ob1 =new Abstract(9,9);
        ob1.mark();
        ob1.display();
    }
}
