package Lesson_11_Homewors3;

import java.util.Objects;

public class ClassB extends ClassA{

    public ClassB(int age) {
        super(age);
    }

    @Override
    public int getAe() {
        return getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassB classB = (ClassB) o;
        return getAge() == classB.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge());
    }
}
