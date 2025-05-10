package Lesson_13;
import java.util.*;

public class StudentDemo {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Иван Иванов", "Группа 1", 1,
                Map.of("Математика", 4, "Физика", 5, "Химия", 3)));
        students.add(new Student("Петр Петров", "Группа 2", 2,
                Map.of("Математика", 2, "Физика", 3, "Химия", 2)));
        students.add(new Student("Сидор Сидоров", "Группа 1", 1,
                Map.of("Математика", 5, "Физика", 5, "Химия", 5)));

        System.out.println("Все студенты:");
        students.forEach(System.out::println);

        StudentProcessor.removeUnderperformingStudents(students);
        System.out.println("\nПосле удаления неуспевающих:");
        students.forEach(System.out::println);

        StudentProcessor.promoteStudents(students);
        System.out.println("\nПосле перевода на следующий курс:");
        students.forEach(System.out::println);

        System.out.println("\nСтуденты 2 курса:");
        StudentProcessor.printStudents(students, 2);
    }
}
