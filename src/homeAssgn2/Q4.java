package homeAssgn2;
class Distance{
    int meter;
    int centimeter;
    Distance(int m,int cm){
        this.meter=m;
        this.centimeter=cm;
    }
    void display(){
        System.out.println("Distance: " + meter + " meters " + centimeter + " centimeters");
    }
    void sum(Distance d1, Distance d2){
        int TotalMeters = d1.meter+d2.meter;
        int TotalCentiMtrs = d1.centimeter+d2.centimeter;
        if (TotalCentiMtrs >= 100) {
            TotalMeters += TotalCentiMtrs / 100;
            TotalCentiMtrs %= 100;
        }

        System.out.println("Sum: " + TotalMeters + " meters " + TotalCentiMtrs + " centimeters");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Distance d1 =new Distance(5,10);
        Distance d2 =new Distance(10,20);
        d1.display();
        d2.display();
        Distance sum = new Distance(0,0);
        sum.sum(d1,d2);
    }
}
