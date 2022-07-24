package Abstract_package;

public class Question1 {
    public static void main(String[]args){
        sum s = new Demo();
        s.sumOfthree(2,3,4);
        s.sumOfTwo(2,3);
    }
}
abstract class sum{
    public abstract void sumOfTwo(int a,int b);
    public abstract void sumOfthree(int a,int b,int c);


}

class Demo extends sum {

    @Override
    public void sumOfTwo(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void sumOfthree(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}