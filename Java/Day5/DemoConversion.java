package Java.Day5;

public class DemoConversion {
    
    //primitive to Object
    int x = 20;
    Integer y = Integer.valueOf(x);

    //Object to Primitive
    int z = y.intValue();

    //Parsing Operations

    //String to primitive
    String s = "30";
    int a = Integer.parseInt(s);

    //String to Object
    Integer b = Integer.valueOf(s);

    //Auto-Boxing
    int i = 10;
    Integer j = i;

    //Auto-unboxing
    int k = j;

}
