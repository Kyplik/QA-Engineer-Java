import java.util.Arrays;

public class Lesson_4 {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(five(0, 1));
        six(1);
        System.out.println(seven(1));
        eight("Java", 1);
        System.out.println(nine(1900));
        ten();
        eleven();
        twelve();
        thirteen();
        System.out.println(Arrays.toString(fourteen(10, 3)));

    }

    // Task №1
    static void printThreeWords () {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Task №2
    static void checkSumSign () {
        int a = 1;
        int b = 2;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else
        {
            System.out.println("Сумма отрицательная");
        }
    }

    // Task №3
    static void printColor () {
        int velue;
        velue = 101;
        if (velue <= 0) {
            System.out.println("Красный");
        } else if (velue >0 && velue <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Task №4
    static void compareNumbers () {
        int a = 1;
        int b = 0;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Task №5
    static boolean five(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


    // Task №6
    static void six (int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // Task №7
    static boolean seven(int number) {
        return number < 0;
    }

    // Task №8
    static void eight(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    // Task №9
    static boolean nine(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    // Task №10
    static void ten() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 1 ? 0 : 1;
        }

        System.out.println(Arrays.toString(array));
    }

    // Task №11
    static void eleven() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    // Task №12
    static void twelve() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // Task №13
    static void thirteen() {
        int size = 10;
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            array[i][size - 1 - i] = 1;
        }

        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Task №14
    static int[] fourteen(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}