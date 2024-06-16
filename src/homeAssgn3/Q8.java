package homeAssgn3;

public class Q8 {
    static void TowerOfHanoi(int n,char from,char to,char aux){
        if(n==1){
            System.out.println("move disk 1 from "+from+" to "+to);
            return;
        }
        TowerOfHanoi(n-1,from,aux,to);
        System.out.println("move disk "+n+" from "+from+" to "+to);
        TowerOfHanoi(n-1,aux,to,from);
    }

    public static void main(String[] args) {
        int n=4;
        TowerOfHanoi(n,'A','B','C');
    }
}
