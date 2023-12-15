package lab9.SecondTask;

import lab9.FirstTask.Student;
import lab9.FirstTask.StudentNotFoundException;
import lab9.FirstTask.StudentSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StudentSystemTest {
    static StudentSystem system;

    @BeforeEach
    void initializeStudents() {
        system = new StudentSystem("src/student.csv");
    }
    @Test
    void testIfStudentIsPresent() throws IOException {
        assertFalse(system.loadStudentsFromFile("src/student.csv").isEmpty());

    } @Test
    void testStudentWithId100() throws StudentNotFoundException {
        assertTrue(system.getStudentsById(100).isPresent());
    }
    @Test
    void testStudentNull() throws StudentNotFoundException {
        assertNull(system.getStudentsById(999).orElse(null));
    }
    @Test
    void testHighestGPAStudent() {
        assertNotNull(system.getHighestGPAStudent());
    }

    @Test
    void testNamesArray() throws IOException {
        String[] expectedNames = {"Camila Wood", "Alexander Thompson", "Liam Taylor", "Evelyn Jenkins", "Michael Jackson"};
        String[] actualNames = system.loadStudentsFromFile("src/student.csv").stream().map(Student::getName).limit(5).toArray(String[]::new);
        assertArrayEquals(expectedNames, actualNames);
    }
    @Test
    void testSize() throws IOException {
        assertEquals(70,system.loadStudentsFromFile("src/student.csv").size());
    }
    @Test
    void testLargestName(){
        lab9.FirstTask.Student studentWithLargestName = system.getLongestNameStudent();
        assertNotEquals("Ava White",studentWithLargestName.getName());
    }
    @Test
    void testStudents(){
        lab9.FirstTask.Student studentWithLongestName = system.getLongestNameStudent();
        lab9.FirstTask.Student studentWithHighestGPA = system.getHighestGPAStudent();
        assertNotEquals(studentWithHighestGPA,studentWithLongestName);
    }
    void testSameStudent() throws StudentNotFoundException {
        lab9.FirstTask.Student studentWithHighestGPA = system.getHighestGPAStudent();
        Optional<lab9.FirstTask.Student> studentWithTheId12 = system.getStudentsById(12);
        assertEquals(studentWithTheId12,studentWithHighestGPA);
    }
}
