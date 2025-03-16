package Java_Assignments.Assignment3.Q2;

public interface Printable {

    default void print(){
            System.out.println("This is default method");
        }
}
