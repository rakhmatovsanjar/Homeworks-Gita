package lesson_11_Homework2;

public class Triangle extends Shape{
    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double perimetr() {
        if ((getA()+getB())>getC()||(getB()+getC())>getA()||(getA()+getC())>getB()){
            return getA()+getB()+getC();
        }
        return 0.0;
    }

    @Override
    public double area() {
        if ((getA()+getB())>getC()||(getB()+getC())>getA()||(getA()+getC())>getB()){
            double p=perimetr()/2;
            return Math.sqrt(p*(p-getA())*(p-getB()*(p-getC())));
        }
        return 0.0;
    }
}
