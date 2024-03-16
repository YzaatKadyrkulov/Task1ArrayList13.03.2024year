package service;

import model.Student;

import java.util.List;

public interface StudentService {
    String addStudent(Student student);
    String addStudent(List<Student> students);

    List<Student> getAllStudents();
    List<Student> getStudentsByGroup(String groupName);

    List<Student> filterStudentsByAge(int minAge, int maxAge);  // 19, 23
    List<Student> getStudentsByInitialLetter(char letter);


}
