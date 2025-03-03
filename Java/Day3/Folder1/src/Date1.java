package Java.Day3.Folder1.src;

class Date1{
	int day, year;
	String month;
	
	public void setDate(int d, String m, int y){
		day = d;
		month = m;
		year = y;
	
	}
	
	public void displayDate(){
		System.out.println(day + "/" + month + "/" + year);

	}

	public static void main(String[] args){
		Date1 date = new Date1();
		date.setDate(27,"Feb",2025);
		date.displayDate();
	}
}