package Practice;

import java.util.Scanner;

public class pyq5A {
    static Scanner sc = new Scanner(System.in);
    public String[] InputOnline(int n){
        String line[] = new String[n];
        System.out.println("Enter 3 lines");
        for (int i = 0; i < n; i++) {
            line[i]=sc.nextLine();
        }
        return line;
    }
    public String[] reverseArray(String[] arr, int start, int end) {
        if (start >= end)
            return arr;
        String temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverseArray(arr, start + 1, end - 1);
    }
    public static void PrintArray(String[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void reverseprint(String s[],int n){
        if(n==0) return;
        System.out.println(s[n-1]);
        reverseprint(s,n-1);
    }
    public static void main(String[] args) {
        pyq5A p1 = new pyq5A();
        String[]s=p1.InputOnline(4);
        reverseprint(s,4);
        System.out.println("Original Array:");
        p1.reverseArray(s, 0, s.length - 1);
        System.out.println("Reversed Array:");
        p1.PrintArray(s);
    }
}
