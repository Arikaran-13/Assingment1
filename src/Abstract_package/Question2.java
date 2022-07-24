package Abstract_package;

public class Question2{

}
abstract class Shape{
    public abstract void area();
    public abstract void draw();
    public abstract void perimeter();

}
class Rectangle extends Shape{

    private int len;
    private int brd;
    Rectangle(int a,int b){
        this.brd=b;
        this.len=a;
    }
    @Override
    public void area() {
        System.out.println("the area of rectangle is : "+len*brd);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void perimeter() {
        System.out.println("The perimeter of rectangle is : ");
        System.out.println(2*(len+brd));
    }
}
class Line extends Shape{

    private int x1,y1,x2,y2;

    Line(int pt1,int pt2,int pt3,int pt4){
        this.x1=pt1;
        this.x2=pt2;
        this.y1=pt3;
        this.y2=pt4;
    }
    @Override
    public void area() {
        System.out.println("Equation of a line in two points");
        System.out.println(x1+","+y1);
        System.out.println(x2+","+y2);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a line");
    }

    @Override
    public void perimeter() {
        System.out.println("n");
    }
}
class Cube extends Shape{
private int a ;
Cube(int a){
    this.a=a;
}
    @Override
    public void area() {
        System.out.println("The area of a cube: ");
        System.out.println(6*a*a);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a cube");
    }

    @Override
    public void perimeter() {
        System.out.println("The perimeter of a cube is : ");
        System.out.println(12*a);
    }
}