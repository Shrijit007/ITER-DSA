package assgn2;
interface DetailInfo{
    void display();
    void count();
}
class pers{
    static int maxCount;
    String name;
    pers(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Name: "+name);
    }
    int count(){
        return name.length();
    }
}
public class Q7 {
    public static void main(String[] args) {
        pers person1 = new pers("Rahul Gandhi");
        pers person2 = new pers("Arvind Kejriwal");
        person1.display();
        System.out.println("Character count: "+person1.count());
        person2.display();
        System.out.println("Character count: "+person2.count());
    }
}
