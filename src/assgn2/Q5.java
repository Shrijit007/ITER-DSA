package assgn2;
class per{
    String name;
    int age;
    per (String s,int a){
        name=s;
        age=a;
    }
}
class employee extends per{
    int eid;
    double salary;
    employee(String s,int a,int e,double  sa){
        super(s,a);
        eid=e;
        salary=sa;
    }
    void empDisplay(){
        System.out.println("Name: "+name+" Age: "+age+" ID: "+eid+" Salary: "+salary);
    }
}
public class Q5 {
    public static void main(String[] args) {

    employee ob1=new employee("Sailesh",19,1,69);
    employee ob2=new employee("Om",19,2,96);
    ob1.empDisplay();
    ob2.empDisplay();
    }
}
