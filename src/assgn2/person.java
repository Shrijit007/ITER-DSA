package assgn2;
import java.util.Scanner;;
public class person {
    String name;
    int age;
    void setData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        name= sc.nextLine();
        System.out.print("Enter age: ");
        age= sc.nextInt();
    }
    void diplayData(){
        System.out.println(name+","+age);
    }
    public static void main(String[] args) {
        person ob1 = new person();
        ob1.name="Rohan";
        ob1.age=20;
        ob1.diplayData();
        person ob2 = new person();
        ob2.setData();
        ob2.diplayData();
        if(ob1.age< ob2.age)
            System.out.println(ob1.name+" is younger.");
        else
            System.out.println(ob2.name+" is younger.");
    }
}
