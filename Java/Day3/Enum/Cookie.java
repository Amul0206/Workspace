package Java.Day3.Enum;

public enum Cookie {

    CHOCOLATE(35), FIVESTAR(100), KITKAT(50);

    private int price;

    private Cookie(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
