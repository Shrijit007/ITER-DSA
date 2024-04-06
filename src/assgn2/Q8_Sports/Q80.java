package assgn2.Q8_Sports;
import assgn2.Q8.*;

interface sports{
    int score1 = 97;
    int score2 = 99;
}
public class Q80 implements sports{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.inputDetails();
        t1.showDetails();
        System.out.println("Total: "+(t1.mark2+t1.mark1+sports.score1+sports.score2));
    }
}
