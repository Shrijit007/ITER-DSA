package assgn1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter wt. in kg");
        double wt=sc.nextDouble();
        System.out.println("Enter height in m");
        double ht=sc.nextDouble();
        double bmi=wt/(ht*ht);
        if(bmi<18.5)
            System.out.println("Underweight");
        else if( bmi<24.9)
            System.out.println("Normal Weight");
        else if(bmi<29.9)
            System.out.println("Overweight ");
        else
            System.out.println("Obese");
    }
}
