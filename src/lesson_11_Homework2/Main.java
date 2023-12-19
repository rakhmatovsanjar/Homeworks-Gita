package lesson_11_Homework2;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(4.0);
        Triangle triangle=new Triangle(3.0,4.0,5.0);
        Rectangle rectangle=new Rectangle(3.0,4.0);

        System.out.println("Doira yuzi: "+circle.area());
        System.out.println("Doira peremetiri: "+circle.perimetr());
        System.out.println("Uchburchak yuzi: "+triangle.area());
        System.out.println("Uchburchak peremetiri: "+triangle.perimetr());
        System.out.println("Turtburchak yuzi: "+rectangle.area());
        System.out.println("Turtburchak peremetiri: "+rectangle.perimetr());
    }
}
