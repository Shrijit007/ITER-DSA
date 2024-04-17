package Practice;

class shape{
    public void display(){
        System.out.println("display");
    }
}
class rectangle extends shape{
    public void area() {
        System.out.println("area");
    }
}
class Cube extends rectangle {
    public void volume() {
        System.out.println("volume");
    }
}
public class MultiLvlInheritance {
    public static void main(String[] args) {
        Cube c = new Cube();
        c.display();
        c.volume();
        c.area();
    }
}
