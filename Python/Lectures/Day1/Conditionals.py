#Grade Printing

grade  = float(input("Enter marks between 0 and 100:- "))

if (grade>=0 and grade<35):
    print("Fail. :(")
    
elif (grade>=35 and grade<60):
    print("Second Class.")
    
elif (grade>=60 and grade<75):
    print("First Class.")
    
elif(grade>=75 and grade<=100):
    print("Distinction. Great Grades. :)")
    
else:
    print("Invalid Marks entered. Please try again.")