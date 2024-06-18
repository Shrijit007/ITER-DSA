package Practice;

public class Generics {
    public static <T>int count(T[]array,T items){
        int n=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==items) n++;
        }
        return n;
    }
}
