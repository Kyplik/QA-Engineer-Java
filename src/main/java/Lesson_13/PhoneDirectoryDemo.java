package Lesson_13;

public class PhoneDirectoryDemo {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Иванов", "+7(800)555-35-35");
        phoneDirectory.add("Петров", "+7(917)142-50-00");
        phoneDirectory.add("Иванов", "+7(927)272-72-72");
        phoneDirectory.add("Сидоров", "+7(846)207-40-30");

        System.out.println("Иванов: " + phoneDirectory.get("Иванов"));
        System.out.println("Петров: " + phoneDirectory.get("Петров"));
        System.out.println("Сидоров: " + phoneDirectory.get("Сидоров"));
    }
}
