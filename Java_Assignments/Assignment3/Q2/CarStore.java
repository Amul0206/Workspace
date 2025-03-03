package Java_Assignments.Assignment3.Q2;

public class CarStore {
    public static void main(String[] args) {
        Vehicle twoWheeler = new twoWheeler("Gixxer",
                "Suzuki",
                1234,
                "Amit",
                "01-01-2021",
                10000,
                1,
                150,
                "Electric");
        twoWheeler.getPolicy().print();

        System.out.println();

        Vehicle fourWheeler = new fourWheeler("Swift",
                "Maruti",
                1235,
                "Mehul",
                "01-01-2021",
                20000,
                2,
                5,
                "Petrol");
        fourWheeler.getPolicy().print();

        System.out.println();

        Test t1 = new Test();
        t1.print();
    }
}
