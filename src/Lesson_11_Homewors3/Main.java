package Lesson_11_Homewors3;

public class Main {
    public static void main(String[] args) {
        ClassB age1=new ClassB(20);
        ClassB age2=new ClassB(20);
        System.out.println(age1.equals(age2));
        System.out.println(age2.equals(age1));
        System.out.println(age1.hashCode());
        System.out.println(age2.hashCode());
        System.out.println(age2.getAe());
    }
}
