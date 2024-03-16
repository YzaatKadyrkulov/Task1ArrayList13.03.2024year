package service.impl;

import model.Student;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    List<Student> studentsList = new ArrayList<>();

    @Override
    public String addStudent(Student student) {
        studentsList.add(student);
        return student.getName() + " is successfully added";
    }

    @Override
    public String addStudent(List<Student> students) {
        studentsList.addAll(students);
        return "Students successfully added";
    }

    @Override
    public List<Student> getAllStudents() {
        return studentsList;
    }

    @Override
    public List<Student> getStudentsByGroup(String groupName) {
        List<Student> students = new ArrayList<>();
        for (Student student : studentsList) {
            if (student.getGroup().equals(groupName)) {
                students.add(student);
            }
        }
        return students;
    }

    @Override
    public List<Student> filterStudentsByAge(int minAge, int maxAge) {
        List<Student> students = new ArrayList<>();
        for (Student student : studentsList) {
            if (student.getAge() >= minAge && student.getAge() <= maxAge) {
                students.add(student);
            }
        }
        return students;
    }

    @Override
    public List<Student> getStudentsByInitialLetter(char letter) {
        List<Student> students = new ArrayList<>();
        for (Student student : studentsList) {
            if(student.getName().startsWith(String.valueOf(letter))){
                students.add(student);
            }
        }
        return students;
    }
}