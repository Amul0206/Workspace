package Java.Day8;

public class Employee {
    int id;
    String name;
    int Salaray;
    String dept;
    public Employee(int id, String name, int salaray, String dept) {
        this.id = id;
        this.name = name;
        Salaray = salaray;
        this.dept = dept;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalaray() {
        return Salaray;
    }
    public void setSalaray(int salaray) {
        Salaray = salaray;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public int getSalary() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSalary'");
    }
}
