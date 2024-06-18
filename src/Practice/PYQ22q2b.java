package Practice;

public class PYQ22q2b {
    public static void count_PNZ(int a[]){
        int p=0,z=0,n=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]<0) n++;
            else if (a[i]>0) p++;
            else z++;
        }
        System.out.println("P:"+p+" Z:"+z+" N:"+n);
    }

    public static void main(String[] args) {
        int a[]={1,-2,0,3,2,-1};
        count_PNZ(a);
    }
}
