package Factory.Products;

public class MeatFactory implements ProductFactory {
    private final String productName;
    private final int price;

    public MeatFactory(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public Product create() {
        return new Meat(productName, price);
    }
}
