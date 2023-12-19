package Lesson_11_Homework1;

public class ClassB extends ClassA{

    public ClassB(String studentName) {
        super(studentName);
    }

    @Override
    public void showInfo() {
        System.out.println(getStudentName());
    }
}
