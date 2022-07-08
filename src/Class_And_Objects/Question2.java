package Class_And_Objects;

public class Question2 {
    public static void main(String[] args) {
        ComplexNumber newnum = new ComplexNumber(2, 4);
        ComplexNumber newnum2 = new ComplexNumber(3, 5);
        newnum.printComplexNumber();
        newnum2.printComplexNumber();
        ComplexNumber.add(newnum, newnum2);
        ComplexNumber.sub(newnum, newnum2);
        ComplexNumber.multiply(newnum, newnum2);
        ComplexNumber.swap(newnum, newnum2);
    }
}

class ComplexNumber {
    private int real;
    private int imaginary;

    ComplexNumber(int r, int d) {
        this.real = r;
        this.imaginary = d;
    }

    public static void add(ComplexNumber c1, ComplexNumber c2) {
        System.out.print(c1.getReal() + c2.getReal() + "+");
        System.out.println(c1.getImaginary() + c2.getImaginary() + "i");
    }

    public static void sub(ComplexNumber c1, ComplexNumber c2) {
        System.out.print(c1.getReal() - c2.getReal() + "+");
        System.out.println(c1.getImaginary() - c2.getImaginary() + "i");
    }

    public static void multiply(ComplexNumber c1, ComplexNumber c2) {
        System.out.print(c1.getReal() * c2.getReal() + "+");
        System.out.println(c1.getImaginary() * c2.getImaginary() + "i");
    }

    public static void swap(ComplexNumber c1, ComplexNumber c2) {
        int r1 = c1.getReal();
        int i1 = c1.getImaginary();

        int r2 = c2.getReal();
        int i2 = c2.getImaginary();

        System.out.println("BEfore swapping : ");
        c1.printComplexNumber();
        c2.printComplexNumber();

        c1.setImaginary(i2);
        c1.setReal(r2);
        c2.setImaginary(i1);
        c2.setReal(r1);
        System.out.println("After swapping : ");
        c1.printComplexNumber();
        c2.printComplexNumber();

    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void printComplexNumber() {
        System.out.println(real + "+" + imaginary + "i");
    }
}