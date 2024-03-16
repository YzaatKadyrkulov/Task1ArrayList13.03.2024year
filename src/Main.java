
import model.Student;
import service.impl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Student деген класс тузунуз (свойства: name, age, group).
         * ArrayList тузуп аны 10 студент менен толтурунуз.
         * 1) Бардык студенттердин маалыматтарын консолго чыгарыныз.
         * 2) Ошол ArrayList ти группасы боюнча фильтрация кылып 2 жаны листке
         * салыныз(Java,JavaScript)
         * 3) Жашы 19 дан 23 ко чейинки студенттерди жаны листке салыныз.
         * 4) Аты "A"тамгасынан башталган студенттерди жаны листке салыныз
         * Ар бир иш аракет учун озунчо метод тузуп, ал методдорду main класска чакырып иштетиниз.
         * Маанилер main класстан берилуусу керек.
         */

        StudentServiceImpl service = new StudentServiceImpl();
        List<Student>students=List.of(
                new Student("Sabina",18,"Java"),
                new Student("Ulan",25,"JS"),
                new Student("Eldiyar",20,"Java"),
                new Student("Meerim",28,"JS"),
                new Student("Almaz",22,"Java"),
                new Student("Aizat",20,"JS"),
                new Student("Bektur",29,"Java"),
                new Student("Borubai",19,"JS"));


        while (true){
            System.out.println("""
                    1. Add one student
                    2. Add many students
                    3. Get all students
                    4. Get students by group
                    5. Filter students by age
                    6. Get students by initial letter
                    """);
            switch (new Scanner(System.in).nextInt()){
                case 1:{
                    System.out.println(service.addStudent(new Student("Nurmuhammed", 18, "Java")));
                    break;
                }
                case 2:{
                    System.out.println(service.addStudent(students));
                    break;
                }
                case 3:{
                    System.out.println(service.getAllStudents());
                    break;
                }
                case 4:{
                    System.out.println("Write group name: ");
                    System.out.println(service.getStudentsByGroup(new Scanner(System.in).nextLine()));
                    break;
                }
                case 5:{
                    System.out.println(service.filterStudentsByAge(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt()));
                    break;
                }
                case 6:{
                    System.out.println("Write letter: ");
                    System.out.println(service.getStudentsByInitialLetter(new Scanner(System.in).next().charAt(0)));
                    break;
                }
                default:{
                    System.out.println("Wrong command!!!");
                }
            }
        }



    }
}
