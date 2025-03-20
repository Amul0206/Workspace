class Employee:
    #By default, class variable is static.
    instance_count = 0
    
    def __init__(self):
        Employee.instance_count += 1
        
    @staticmethod
    def display():
        return Employee.instance_count

    
e1 = Employee()
e2 = Employee()
e3 = Employee()

print(Employee.display())