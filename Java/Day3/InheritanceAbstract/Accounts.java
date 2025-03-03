package Java.Day3.InheritanceAbstract;

public class Accounts {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        Employee [] emps = new Employee[3];
        emps[0] = new SalariedEmployee(2234, "ppp", 600000);    //Up Casting
        emps[1] = new Manager(56475, "mmm", 80000);
        emps[2] = new ContractEmployee(342, "sss", 40, 500);

        for(Employee e : emps){
            payroll.displayGross(e);
        }

        SalariedEmployee se = (SalariedEmployee) emps[0];   //Down Casting
        payroll.displayNet(se);

        for(Employee e : emps){
            if (e instanceof SalariedEmployee){
                //((SalariedEmployee) e).calculateNet();
                SalariedEmployee s = (SalariedEmployee)e;
                payroll.displayNet(s);
            }
        }
    }
}
