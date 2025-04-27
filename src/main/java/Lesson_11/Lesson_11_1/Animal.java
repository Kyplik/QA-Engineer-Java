package Lesson_11.Lesson_11_1;

class Animal {
    private static int animalCount = 0;
    private String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(name + " бежит " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " плывет " + distance + " м.");
    }

    public String getName() {
        return name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}