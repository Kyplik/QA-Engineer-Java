package Lesson_11.Lesson_11_1;

public class Main {
    public static void main(String[] args) {
        // Создаем животных
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Васька");

        // Тестируем бег и плавание
        dog1.run(150);
        dog1.run(600);
        dog1.swim(5);
        dog1.swim(15);

        cat1.run(100);
        cat1.run(250);
        cat1.swim(10);

        // Работа с миской и котами
        Bowl bowl = new Bowl(30);
        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats) {
            cat.eat(bowl, 15);
        }

        // Проверяем сытость
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + !cat.isHungry());
        }

        // Добавляем еды и кормим снова
        bowl.addFood(30);
        cat2.eat(bowl, 15);
        System.out.println(cat2.getName() + " сыт: " + !cat2.isHungry());

        // Выводим статистику
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());
    }
}