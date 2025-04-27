package Lesson_13;
import java.util.*;

class PhoneDirectory {
    private Map<String, List<String>> directory;

    public PhoneDirectory() {
        this.directory = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        directory.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return directory.getOrDefault(surname, Collections.emptyList());
    }
}

public class Lesson_13_2 {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        // Добавляем записи
        phoneDirectory.add("Иванов", "+7(800)555-35-35");
        phoneDirectory.add("Петров", "+7(917)142-50-00");
        phoneDirectory.add("Иванов", "+7(927)272-72-72");
        phoneDirectory.add("Сидоров", "+7(846)207-40-30");

        // Поиск номеров по фамилии
        System.out.println("Иванов: " + phoneDirectory.get("Иванов"));
        System.out.println("Петров: " + phoneDirectory.get("Петров"));
        System.out.println("Сидоров: " + phoneDirectory.get("Сидоров"));
    }
}
