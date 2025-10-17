package Factory.Products;

public class BeverageFactory implements ProductFactory {
    private final String productName;
    private final int price;
    private final int stock;

    public BeverageFactory(String productName, int price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public Product create() {
        return new Beverage(productName, price, stock);
    }
}
