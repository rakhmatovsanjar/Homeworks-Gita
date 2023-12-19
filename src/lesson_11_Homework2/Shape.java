package lesson_11_Homework2;

public abstract class Shape {
    private double a;
    private double b;
    private double c;
    private double r;

    public Shape(double r){
        this.r=r;
    }

    public Shape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double perimetr();
    public abstract double area();

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getR() {
        return r;
    }
}
