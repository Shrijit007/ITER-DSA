public class Q1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if(n<=2){
            System.out.println("number less than 2");
        }
        int count =0;
        while(n>2){
            n/=2;
            count++;
        }
        System.out.println(count);
    }
}