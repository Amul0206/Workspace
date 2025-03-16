package Java_Assignments.Assignment2;

import java.util.ArrayList;

public class Cart {

    ArrayList<CartItem> lst=new ArrayList<>();
    int tot_price=0;
    int count=0;

    public void addToCart(Dessert d,int flavour, int qty){

        int price=d.calculatePrice(qty, d.getRates()[flavour-1]);
        lst.add(new CartItem(d, d.getFls()[flavour-1], d.getRates()[flavour-1], qty, price));
        count+=qty;
        tot_price+=price;
    }

    public void displayBill(){
        System.out.println("Bill Receipt:");
        System.out.println("Dessert | Flavour | Rate | Unit | Qty | Price");
        System.out.println("================================================================================================================");
        for(int i=0;i<lst.size();i++){
            CartItem item=lst.get(i);
            System.out.println(item.des+" | "+item.getFl()+" | "+item.getRate()+" | "+item.getDes().getUnit()+" | "+item.getQty()+" | "+item.getPrice());
        }
    }

   public int getCount() {
    return count;
    }

 public int getPrice() {
        return tot_price;
    }
    
}
