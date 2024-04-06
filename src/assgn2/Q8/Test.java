package assgn2.Q8;

public class Test extends Student {
        public int mark1;
        public int mark2;
    public void inputDetails() {
        super.inputDetails();
        mark1=90;
        mark2=89;
    }
    public void showDetails() {
        super.showDetails();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}