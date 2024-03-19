package assgn2;

public class deposit {
    long principal;
    int time;
    double rate,totalAmt;
    deposit(long a,int b,double c){
        principal=a;
        time=b;
        rate=c;
    }
    deposit(long a,int b){
        principal=a;
        time=b;
    }
    deposit(long a,double c){
        principal=a;
        rate=c;
    }
    deposit(){
        System.out.print("");
    }
    void display(){
        System.out.print("Principal: "+principal+" Time: "+time+" Rate: "+rate);
    }
    void calcAmt(){
        totalAmt=principal+((principal*rate*time)/100);
        System.out.println(" Total Amount: "+totalAmt);
    }
    public static void main(String[] args) {
        deposit ob1=new deposit();
        deposit ob2=new deposit(12,20.0);
        deposit ob3=new deposit(12,1,3.0);
        deposit ob4=new deposit(12,1);
        ob1.display();
        ob1.calcAmt();
        ob2.display();
        ob2.calcAmt();
        ob3.display();
        ob3.calcAmt();
        ob4.display();
        ob4.calcAmt();
    }
}
