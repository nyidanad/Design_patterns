package Factory.Products;

public class BeverageFactory implements ProductFactory {
    private final String productName;
    private final int price;

    public BeverageFactory(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public Product create() {
        return new Beverage(productName, price);
    }
}
