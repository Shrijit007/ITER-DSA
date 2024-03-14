package homeAssgn1;

import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        Random r=new Random();

        int arr[][]=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j]= r.nextInt(0,2);
            }
        }
        int c=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (c==4){
                    c=0;
                    System.out.println();
            }
                System.out.print(arr[i][j]+" ");
                c++;
            }
        }
        int count1=0;
        int arr1[]=new int[4];
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if(arr[i][j]==1){
                count1++;
            }
        }
        arr1[i]=count1;
    }
        int posn1=0;
        int max=arr1[0];
        for (int i = 1; i < 4; i++) {
            if(arr1[i]>max){
                max=arr1[i];
                posn1=i;
            }
        }
        System.out.println(posn1);
    }
}
