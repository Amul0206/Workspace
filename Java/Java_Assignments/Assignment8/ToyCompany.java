package Java_Assignments.Assignment8;

import java.util.ArrayList;
import java.util.List;

public class ToyCompany {

    public List<Toy> initializedata(){
        List<Toy> toylist=new ArrayList<>();

        Toy t1= new Toy(101,"Doll", 500,"Toy", 5,"Jan", 2020);
        Toy t2= new Toy(102,"Car", 600,"Toy", 6,"Feb", 2020);
        Toy t3= new Toy(103,"Train", 700,"Toy", 7,"Mar", 2020);
        Toy t4= new Toy(104,"Plane", 800,"Toy", 8,"Apr", 2020);
        Toy t5= new Toy(105,"Robot", 900,"Toy", 9,"May", 2020);
        Toy t6= new Toy(106,"Teddy", 1000,"Toy", 10,"Jun", 2020);

        toylist.add(t1);
        toylist.add(t2);
        toylist.add(t3);
        toylist.add(t4);
        toylist.add(t5);
        toylist.add(t6);
    
        return toylist;

    }

}
