package Java.Day10;

public class Student {
    @SuppressWarnings("unused")
    private int rollno;
    @SuppressWarnings("unused")
    private String name;

    // Default constructor
    public Student() {
        this.rollno = 0;
        this.name = "";
    }

    // Parameterized constructor
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @CreatedBy(priority = 2, author = "abc")
    public void  simpleMethod(){
        System.out.println("This is a public method.");
    }

    public static void staticMethod(){
        System.out.println("This is a static method.");
    }

    @SuppressWarnings("unused")
    private void privateMethod(){
        System.out.println("This is a private method.");
    }

    @CreatedBy(priority = 1, author = "xyz")
    public void setValues(int rollno, String name){
        this.rollno=rollno;
        this.name = name;

        System.out.println("");
        System.out.println("Values set to roll no: " + rollno + "name : " + name);
    }

}
