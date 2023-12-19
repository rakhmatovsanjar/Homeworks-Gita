package lesson_11_Homework2;

public class Circle extends Shape{
    public Circle(double r) {
        super(r);
    }

    @Override
    public double perimetr() {
        return 2*Math.PI*getR();
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(getR(),2);
    }
}
