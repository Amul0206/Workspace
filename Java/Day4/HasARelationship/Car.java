package Java.Day4.HasARelationship;

class Engine {
    public void start(){
        System.out.println("Engine is starting.....");
    }
}

class Car{
    //Engine's object is present in Car
    protected Engine engine;  //Has A Relationship

    Car() {
        this.engine = new Engine();
    }

    void startCar(){
        engine.start();     //Using Engine's method
        System.out.println("Car is starting.....");
    }

    
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.startCar();
    }

}