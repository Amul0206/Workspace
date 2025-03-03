package Java_Assignments.Assignment2;

public class CartItem {
    
    Dessert des;
    String fl;
    int rate;
    int qty;
    int price;

    public CartItem(Dessert des, String fl, int rate, int qty, int price) {
        this.des = des;
        this.fl = fl;
        this.rate = rate;
        this.qty = qty;
        this.price = price;
    }
    
    public Dessert getDes() {
        return des;
    }

    public String getFl() {
        return fl;
    }

    public int getRate() {
        return rate;
    }

    public int getQty() {
        return qty;
    }

    public int getPrice() {
        return price;
    }
}
