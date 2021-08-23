package one.digitalinnovation.comparators;

public class Student implements Comparable<Student> {

    private final String name;
    private final Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public Integer getAge () {
        return age;
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return  name + " - " + age;
    }
}
