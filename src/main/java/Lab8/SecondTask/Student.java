package Lab8.SecondTask;

import java.util.List;

public class Student {
    private String name;
    private int Id;
    protected List<Integer> grades;

    public Student(String name, int Id, List<Integer> grades) {
        this.name = name;
        this.Id = Id;
        this.grades = grades;
    }

    public Student(List<Integer> grades) {
        this.grades=grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setID(int Id) {
        this.Id = Id;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
    public void printInfo(){
        System.out.println("Student name: "+getName());
        System.out.println("Student ID: "+getId());
        System.out.println("Student grades: "+getGrades());
    }
}
