package Java_Assignments.Assignment2;
import java.util.*;

public class DesertStore {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int in;

        Cart c=new Cart();

        System.out.println("================================================================================================================");
        System.out.println("                                   WELCOME TO AMUL DESSERT STORE!!!");
        while(true){
            System.out.println("================================================================================================================");
            System.out.println("Enter dessert number from below menu:");
            System.out.println("================================================================================================================");
            System.out.println("1. Candies");
            System.out.println("2. Cookies");
            System.out.println("3. Icecreams");
            System.out.println("4. Quit");
            System.out.println("================================================================================================================");
            System.out.print("Enter your choice: ");
            in=sc.nextInt();
            System.out.println("================================================================================================================");

            int fl, qty;
            Dessert d=null;
            boolean quit=false;

            switch(in){
                case 1: 
                    d=new Candies();
                    break;
                case 2:
                    d=new Cookies();
                    break;
                case 3:
                    d=new Icecream();
                    break;
                case 4:
                    quit=true;
                    break;
            }

            if(quit==true) break;

            d.info();

            System.out.println("================================================================================================================");
            System.out.print("Enter flavour number: ");
            fl=sc.nextInt();
            System.out.println("================================================================================================================");
            System.out.print("enter Quantity: ");
            qty=sc.nextInt();

            c.addToCart(d, fl, qty);
        }


        c.displayBill();
        System.out.println("================================================================================================================");
        System.out.println("                                      Total Bill: "+c.getPrice());
        System.out.println("                                      Items count: "+c.getCount());
        System.out.println("                                  THANKS FOR CHOOSING US!");
        System.out.println("================================================================================================================");
        sc.close();
    }
}
