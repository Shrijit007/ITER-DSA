package homeAssgn2;

import java.awt.font.TextAttribute;

class PointType{
    double x,y;
    PointType(double x,double y){
        this.x=x;
        this.y=y;
    }
    void showPoint(){
        System.out.println("("+x+","+y+")");
    }
    void showX(){
        System.out.println(x);}
    void showY(){
        System.out.println(y);
    }
}
class Q5_Circle extends PointType{
    int radius;
    Q5_Circle(int r,double x,double y){
        super(x,y);
        radius=r;
    }
    void area(){
        System.out.println(2*Math.PI*Math.pow(radius,2)+" m2");
    }
    void circumference(){
        System.out.println(2*Math.PI*radius+" m3");
    }
}
public class Q5{
    public static void main(String[] args) {
        Q5_Circle c1 = new Q5_Circle(2,1,3);
        c1.showPoint();
        c1.showX();
        c1.showY();
        c1.area();
        c1.circumference();
    }
}