package co.develhope.email01.students.services;
import co.develhope.email01.students.entities.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    static List<Student> students = Arrays.asList(
            new Student("1", "Ken", "Adams", "ken@adams.com"),
            new Student("2", "Regina", "Phalange", "regina@phalange.com"),
            new Student("3", "Crap", "Bag", "crap@bag.com"),
            new Student("4", "David", "Scientist", "david@scientist.com")
    );

    public Student getStudentById(String studentId) {
        Optional<Student> studentFromList = students.stream().filter(student -> student.getId().equals(studentId)).findAny();
        return studentFromList.isPresent() ? studentFromList.get() : null;
    }
}