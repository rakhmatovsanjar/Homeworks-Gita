package lesson_11_Homework2;

public class Rectangle extends Shape{
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double perimetr() {
        return 2*(getA()+getB());
    }

    @Override
    public double area() {
        return getB()*getA();
    }
}
