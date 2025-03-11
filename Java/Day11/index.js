class Employee{
    constructor(){

    }

    printEmp(){
        console.log("Hello from emp")
    }
}

class Manager extends Employee{

}

e = new Manager();
e.printEmp();