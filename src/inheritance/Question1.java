package InheritanceAndPolymorphism;

public class Question1 {
    public static void main(String[]args){
        Employee e = new Employee(1,"john",15000);
        Manager m = new Manager(121,"marcos",45000,10000);
        Labour b = new Labour(102,"karl",10000,8);
        Employee e1 = new Manager(2,"clarice",20000,10000);
        System.out.println( m.totalSal());
        System.out.println( b.totalSal());
        System.out.println( e.totalSal());
        System.out.println( e1.totalSal());
    }
}
class Employee{

    private int id;
    private String name;
    private int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
    public int totalSal(){
        return sal;
    }
}
class Labour extends Employee{
private int OvertimeHrs;
    Labour(int id , String name,int sal,int hrs){
        super(id,name,sal);
        this.OvertimeHrs=hrs;
    }
    @Override
    public int totalSal(){

       return  super.getSal()+(OvertimeHrs*100);
    }
}
class Manager extends Employee{

    private int bonus;
    Manager(int id,String name,int sal,int incentive){
        super(id,name,sal);
        this.bonus=incentive;
    }
    @Override
    public int totalSal(){
      return  super.getSal()+bonus;
    }
}
