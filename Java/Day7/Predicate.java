package Java.Day7;

public interface Predicate {

    //Predicate is a functional interface. It has only one abstract method test.
    //test is an abstract function that takes an integer and returns a boolean.
    
    boolean test (int n);
}