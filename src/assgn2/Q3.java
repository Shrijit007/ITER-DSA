package assgn2;
import java.util.Scanner;

class product{
    int prodid;
    double price;
    int qty;
    static double  tp;
    product  (int prodid,double price,int qty){
        this.prodid=prodid;
        this.price=price;
        this.qty=qty;
    }
    void display(){
        System.out.println("Product id: "+prodid);
        System.out.println("Product price: "+price);
        System.out.println("Product quantity: "+qty);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        product arr[]=new  product[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter product id: ");
            int id=sc.nextInt();
            System.out.print("Enter product price: ");
            int prc=sc.nextInt();
            System.out.print("Enter product quantity: ");
            int qt=sc.nextInt();
            arr[i]= new product(id,prc,qt);
        }
        for (int i = 0; i < arr.length; i++) {
            product.tp+=((arr[i].price)*(arr[i].qty));
            arr[i].display();
        }
        System.out.println("Total price of products: "+product.tp);
    }
}
