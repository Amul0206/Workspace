class Employee:
    def __init__(self, empid, name, basicSalary):
        self.empid = empid
        self.name = name
        self.basicSalary = basicSalary
        self.HRA = basicSalary*0.5
        self.PT = 200
        self.PF = basicSalary*0.12
        
    def __str__(self):
        return str(self.empid)
        
    def grossSal(self):
        return self.basicSalary + self.HRA + self.PT + self.PF
    
    def netSal(self):
        return (self.basicSalary + self.HRA + self.PT + self.PF) - self.PT - self.PF
    


class Manager(Employee):
    def __init__(self, empid, name, basicSalary):
        super().__init__(empid, name, basicSalary)
        self.food_al=basicSalary*0.1
        self.manager_al=basicSalary*0.05
        self.other_al=basicSalary*0.03
    
        
class MarketingExecutive(Employee):
    def __init__(self, empid, name, basicSalary, kms, rate):
        super().__init__(empid, name, basicSalary)
        self.travel_al=kms*rate
        self.phone_al=1000
       
        
emp1 = Employee(1, "Ankita", 25000)

emp2 = Manager(2,"Taylor swift", 100000)

emp3 = MarketingExecutive(3,"Elon Musk",10,5,1)

print(emp1.grossSal())
print(emp1.netSal())

print(emp2.grossSal())
print(emp2.netSal())


print(emp3.grossSal())
print(emp3.netSal())

list_of_Employees = [Employee(1, "Ankita", 25000), Manager(2,"Taylor swift", 100000), MarketingExecutive(3,"Elon Musk",10,5,1)]

list_of_Mangers = [i for i in list_of_Employees if isinstance(i, Manager)]

list_of_MarketingExecutive = [i for i in list_of_Employees if isinstance(i, MarketingExecutive)]

print(list_of_Mangers[0])
print(list_of_MarketingExecutive[0])

 