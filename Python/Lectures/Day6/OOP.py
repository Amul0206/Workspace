class Employee:
    
    def __init__(self, rollNo, Name):
        
        self.rollNo = rollNo
        self.Name = Name
    
    
    
    def printInfo(self):
        print("ROLL NO: ", self.rollNo)
        print("NAME: ", self.Name)
    

class Developer(Student):
    
    def __init__(self, rollNo, Name):
        super().__init__(rollNo, Name)
        self.developerAllowance = salary*0.10
        
    def writeCode(self):
        print("Developer writes code!")
        
    def printInfo(self):
         super().printInfo()
         print("Allowance: ", self.developerAllowance)
    
student1 = Student(25, "Ankita")
student1.printInfo()

print()

dev1 = Developer(45, "Ajay")
dev1.printInfo()

#print(Student.rollNo)
