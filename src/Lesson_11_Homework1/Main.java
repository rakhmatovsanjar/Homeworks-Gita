package Lesson_11_Homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Talaba ismini kiriting: ");
        String studentName=scanner.next();
        ClassB classB=new ClassB(studentName);
        System.out.print("Talaba ismi: ");
        classB.showInfo();
    }
}
