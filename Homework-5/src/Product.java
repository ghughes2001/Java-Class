public class Product {
    String name;
    double price;

    public Product(String NAME, double PRICE)
    {
        this.name = NAME;
        this.price = PRICE;
    }
    void getPriceRange()
    {
        System.out.println(price);
    }
}
