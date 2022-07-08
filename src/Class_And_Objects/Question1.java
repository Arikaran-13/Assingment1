package Class_And_Objects;

public class Question1 {
    public static void main(String[]args){
        Date d1 = new Date();
        d1.setDay(1);
        d1.setMonth(1);
        d1.setYear(2022);
        d1.printDate();
        Date d2 = new Date();
        d2.setDay(13);
        d2.setMonth(2);
        d2.setYear(2001);
        d2.printDate();
        Date.swapDate(d1,d2);
    }
}

class Date{
    private int day;
    private int month;
    private int year;
    Date(){ //default construtor

    }
    Date(int d,int m,int y){ //parametrized constructor
        this.day=d;
        this.month=m;
        this.year=y;

    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void printDate(){
        System.out.println(day+"/"+month+"/"+year);
    }
 public static void swapDate(Date d1 , Date d2){
     int d=   d1.getDay();
     int m =  d1.getMonth();
      int y=  d1.getYear();

      int D2 = d2.getDay();
      int m2=d2.getMonth();
      int y2= d2.getYear();
     System.out.println("Befor Swapping:  ");
     d1.printDate();
     d2.printDate();

      d2.setDay(d);
      d2.setMonth(m);
      d2.setYear(y);

     d1.setMonth(m2);
     d1.setDay(D2);
     d1.setYear(y2);
     System.out.println("Dates Swapped successfully :) ");
     System.out.println("After Swapping:  ");
     d1.printDate();
     d2.printDate();
 }


}