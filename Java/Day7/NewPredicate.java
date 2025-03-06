package Java.Day7;

//Predicate is a functional interface. It has only one abstract method test.
//It is used for filter.

public interface NewPredicate<T> {
    boolean test (T data);
}
