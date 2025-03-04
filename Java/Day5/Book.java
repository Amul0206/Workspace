package Java.Day5;

public class Book {
    public int isbn;
    public String name;

    public void book(int isbn, String name){
        this.isbn = isbn;
        this.name = name;
    }

    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
