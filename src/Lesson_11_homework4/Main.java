package Lesson_11_homework4;

public class Main {
    public static void main(String[] args) {
        ClassA obekt1=ClassA.getInstance();
        ClassA obekt2=ClassA.getInstance();

        System.out.println(obekt1.hashCode() == obekt2.hashCode());
    }
}
