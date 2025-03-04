package Java.Day3.Enum;

public enum Coffee {

    //ENUM CONSTANTS
    SMALL(50), MEDIUM(80), LARGE(100);

    private int price;

    private Coffee(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public static void main(String[] args) {
        
    }
}
