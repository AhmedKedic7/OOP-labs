package lab9.FirstTask;

import java.util.Optional;

public class StudentMain {
    public static void main(String[] args) throws StudentNotFoundException {
        StudentSystem system = new StudentSystem("src/students.csv");

        Student s1 = system.getHighestGPAStudent();
        Student s2 = system.getLongestNameStudent();
        Optional<Student> s3 = system.getStudentsById(10);

        System.out.println(s3);
        System.out.println(s2);
        System.out.println(s1);

    }
}
