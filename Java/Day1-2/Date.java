//ASSIGNMENT 2

package JAVA;

class Date{
    int day, year;
    String month;

    public void setDate(int d, String m, int y){
        day = d;
        month = m;
        year = y;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year; 
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void getDate(){
        System.out.println(day+"/"+month+"/"+year);
    }

    public String toString(){
        return day + "/" + month + "/" + year;
    }
    public static void main(String[] args) {
        Date d = new Date();
        d.setDate(28, "Feb", 2025);
        d.getDate();
    }
    
}