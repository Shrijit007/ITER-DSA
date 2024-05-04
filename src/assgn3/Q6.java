package assgn3;

import Practice.Interface;

public class Q6 {
    public static <T> int count (T[] array,T item){
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if(array[j].equals(item)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Integer intArray[]={1,4,2,5,3,2,2};
        String stringArray[]  ={"hello","world"};
        Character charArray[]={'e','r','q','r'};
        System.out.println("2 occurs: "+count(intArray,2));
        System.out.println("Hello occurs: "+count(stringArray,"hello"));
        System.out.println("r occurs: "+count(charArray,'r'));
    }
}
