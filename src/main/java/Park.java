public class Park {
    private String parkName;
    private Attraction[] attractions;

    public Park(String name, int attractionCount) {
        this.parkName = name;
        this.attractions = new Attraction[attractionCount];
    }

    // Внутренний класс
    public class Attraction {
        private String name;
        private String workingHours;
        private int price;

        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
        }
    }

    public void addAttraction(int index, String name, String workingHours, int price) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(name, workingHours, price);
        }
    }

    public void printParkInfo() {
        System.out.println("Парк: " + parkName);
        System.out.println();
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.printInfo();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Park disneyland = new Park("ПАРК ПОБЕДЫ", 3);

        disneyland.addAttraction(0, "КОЛЕСО ОБОЗРЕНИЯ", "7:00-22:00", 500);
        disneyland.addAttraction(1, "БАТУТ", "10:00-22:00", 200);
        disneyland.addAttraction(2, "ГОРКИ", "10:30-22:30", 100);

        disneyland.printParkInfo();
    }
}
