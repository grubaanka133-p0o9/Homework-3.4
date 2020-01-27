public class Test {
    public static void main(String[] args) {
        Category category = new Category("sweets", "for a better day");
        Category category1 = new Category("fruits", "fresh and healthy");
        Product product = new Product("candy bar", 3.50, "chocolate", category);
        Product product1 = new Product("chocolate bar", 5.80,"with strawberries", category);
        Product product2 = new Product("apple", 1.20,"from Poland", category1);
        Product product3 = new Product("bike", 1200, "dirt/dual");
        SpecialOffer offer = new SpecialOffer(product1, "bestseller", "28.01.2020","15.02.2020", 0.2);

        product.showProduct();
        product1.showProduct();
        product2.showProduct();
        product3.showProduct();

        offer.showOffer();
    }
}
