package Lesson_13;
import java.util.*;

class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public void promoteToNextCourse() {
        this.course++;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
}

public class Lesson_13_1 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        // Добавляем студентов
        students.add(new Student("Иван Иванов", "Группа 1", 1,
                Map.of("Математика", 4, "Физика", 5, "Химия", 3)));
        students.add(new Student("Петр Петров", "Группа 2", 2,
                Map.of("Математика", 2, "Физика", 3, "Химия", 2)));
        students.add(new Student("Сидор Сидоров", "Группа 1", 1,
                Map.of("Математика", 5, "Физика", 5, "Химия", 5)));

        System.out.println("Все студенты:");
        students.forEach(System.out::println);

        // Удаляем студентов с средним баллом < 3
        removeUnderperformingStudents(students);
        System.out.println("\nПосле удаления неуспевающих:");
        students.forEach(System.out::println);

        // Переводим студентов на следующий курс
        promoteStudents(students);
        System.out.println("\nПосле перевода на следующий курс:");
        students.forEach(System.out::println);

        // Печатаем студентов по курсу
        System.out.println("\nСтуденты 2 курса:");
        printStudents(students, 2);
    }

    public static void removeUnderperformingStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.promoteToNextCourse();
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        students.stream()
                .filter(student -> student.getCourse() == course)
                .forEach(student -> System.out.println(student.getName()));
    }
}
