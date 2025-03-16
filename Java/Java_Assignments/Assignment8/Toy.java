package Java_Assignments.Assignment8;

public class Toy {
    int id;
    String name;
    int price;
    String category;
    int age;
    String purchaseMonth;
    int purchaseYear;
    public Toy(int id, String name, int price, String category, int age, String purchaseMonth, int purchaseYear) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.age = age;
        this.purchaseMonth = purchaseMonth;
        this.purchaseYear = purchaseYear;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPurchaseMonth() {
        return purchaseMonth;
    }
    public void setPurchaseMonth(String purchaseMonth) {
        this.purchaseMonth = purchaseMonth;
    }
    public int getPurchaseYear() {
        return purchaseYear;
    }
    public void setPurchaseYear(int purchaseYear) {
        this.purchaseYear = purchaseYear;
    }
    @Override
    public String toString() {
        return "Toy [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", age=" + age
                + ", purchaseMonth=" + purchaseMonth + ", purchaseYear=" + purchaseYear + "]";
    }
    
}
