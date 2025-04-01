public class Lesson_6 {

    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung s25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, false);
        productsArray[1] = new Product("iPhone 16 ProMax", "11.11.2024", "Apple Inc.", "USA", 6499, true);
        productsArray[2] = new Product("Xiaomi 14", "22.22.2024", "Xiaomi Corporation", "China", 3999, true);
        productsArray[3] = new Product("Galaxy Tab S9", "33.33.2023", "Samsung Corp.", "Korea", 2499, false);
        productsArray[4] = new Product("MacBook Pro 16", "44.44.2023", "Apple Inc.", "USA", 9999, true);

        for (Product product : productsArray) {
            product.printInfo();
        }
    }
}

