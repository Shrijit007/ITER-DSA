package assgn2;
import java.util.Scanner;

class complex{
    int real;
    int imag;
    void setData(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter real part: ");
        real=sc.nextInt();
        System.out.print("Enter imag part: ");
        imag=sc.nextInt();
    }
    void display(){
        System.out.println(real+"+"+imag+"i");
    }
    public complex add(complex one,complex two){
        complex ob3=new complex();
        ob3.real=one.real+two.real;
        ob3.imag=one.imag+two.imag;
        return ob3;
    }
}
public class Q2 {
    public static void main(String[] args) {
        complex ob1=new complex();
        complex ob2=new complex();
        complex ob4=new complex();
        ob1.setData();
        ob1.display();
        ob2.setData();
        ob2.display();
        ob4=ob4.add(ob1,ob2);
        System.out.print("Sum of both complex no. is ");
        ob4.display();
    }
}
