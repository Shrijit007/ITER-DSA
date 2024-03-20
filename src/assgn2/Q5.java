package assgn2;

class per{
    String name;
    int age;
    per (String s,int a){
        name=s;
        age=a;
    }
    per(){}
}
class employee extends per{
    int eid;
    double salary;
    employee(String s,int a,int e,double  sa){
        name=s;
        age=a;
        eid=e;
        salary=sa;
    }
    void empDisplay(){
        System.out.println("Name: "+name+" Age: "+age+" ID: "+eid+" Salary: "+salary);
    }
}
public class Q5 {
    employee ob1=new employee("Sailesh",19,01,69);
    employee ob2=new employee("Om",19,02,96);

}
