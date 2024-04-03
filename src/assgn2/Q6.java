package assgn2;
abstract class Marks{
    int markICP;
    int markDSA;
    double percentage;
    abstract void getPercentage();
}
class CSE extends Marks{
    int algoDesign;
    CSE(int icp,int dsa,int algo){
        markICP=icp;
        markDSA=dsa;
        algoDesign=algo;
    }
    void getPercentage() {
        percentage=(markDSA+markICP+algoDesign)/3;
        System.out.println("Percentage: "+percentage);
    }
}
class nonCSE extends Marks{
    int enggMech;
    nonCSE(int icp,int dsa,int engg){
        markICP=icp;
        markDSA=dsa;
        enggMech=engg;
    }
    void getPercentage() {
        percentage=(markDSA+markICP+enggMech)/3;
        System.out.println("Percentage: "+percentage);
    }
}
public class Q6 {
    public static void main(String[] args) {
    CSE ob1 = new CSE(80,90,87);
    ob1.getPercentage();
    nonCSE ob2=new nonCSE(95,79,84);
    ob2.getPercentage();
    }
}
