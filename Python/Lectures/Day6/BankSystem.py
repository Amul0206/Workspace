class Bank:
    def __init__(self, account_number, balance):
        self.account_number = account_number
        self.balance = balance
        
    def deposit(self, amount):
        self.amount = amount
        
        self.balance = self.balance + amount
        
        return self.balance
    
    def withdraw(self, amount):
        self.amount = amount
        
        if amount>self.balance:
            print("Invalid transactiom. Enter amount less than balance!")
            
        else:
            self.balance -= self.amount

        return self.balance
    
    def display(self):
        print("BALANCE: " , self.balance)
    
b = Bank("123", 98000)
b.display()

print()

b.deposit(35000)
b.display()

print()

b.withdraw(10000)
b.display()
