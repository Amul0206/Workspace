//ASSIGNMENT_3

package Java.Day1and2;

class Student{
	int rollno;
	String name;
	static int count=0;

	public Student(String name){
		this.name=name;
		count+=1;
		rollno=count;
	}

	public static void displayCount(){
		System.out.println(count);
	}
	
	public static void main(String[] args){
		
		//Student s1 = new Student("Amit");	//Constructor
		//Student s2 = new Student("mehul");
		Student.displayCount();
	}

	
}