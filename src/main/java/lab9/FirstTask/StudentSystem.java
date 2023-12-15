package lab9.FirstTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentSystem {

    private List<Student> students;

    public StudentSystem(String fileName) {
        try{
            students = loadStudentsFromFile(fileName);

        }catch (IOException e){
            System.out.println("Unable to read a file!");
        }

    }
    public List<Student> loadStudentsFromFile(String fileName) throws IOException{
        List<Student> students = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        List<String> lines=bufferedReader.lines().collect(Collectors.toList());
        for(String line : lines){
            String[] parsedLine= line.split(",");
            Student temp = new Student(
                    parsedLine[0] == "" ? 0 : Integer.parseInt(parsedLine[0]),
                    parsedLine[1],
                    parsedLine[2],
                    parsedLine[3],
                    parsedLine[4] == "" ? 1 : Double.parseDouble(parsedLine[4])
            );
            students.add(temp);
        }
        bufferedReader.close();
        return students;
    }
    public Optional<Student> getStudentsById(int id) throws StudentNotFoundException {
        for(Student student : students){
            if(student.getID() == id){
                return Optional.of(student);
            }
        }
        throw new StudentNotFoundException("Student couldn't be found!");
    }
    public Student getHighestGPAStudent() throws EmptyStudentListException{
        if (students == null) {
            throw new EmptyStudentListException("List of students is null.");
        }
        if (students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty.");
        }
        Student highestGPAStudent = students.get(0);
        for(Student student : students){
            if(student.getGPA()>highestGPAStudent.getGPA()){
                highestGPAStudent = student;
            }

        }
        return highestGPAStudent;
    }
    public Student getLongestNameStudent() throws EmptyStudentListException{
        if (students == null) {
            throw new EmptyStudentListException("List of students is null.");
        }
        if (students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty.");
        }
        Student longestNameStudent = students.get(0);
        for(Student student : students){
            if(student.getName().length() > longestNameStudent.getName().length()){
                longestNameStudent = student;
            }

        }
        return longestNameStudent;
    }

}
