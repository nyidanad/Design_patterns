package Factory.Products;

public class MeatFactory implements ProductFactory {
    private final String productName;
    private final int price;
    private final int stock;

    public MeatFactory(String productName, int price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public Product create() {
        return new Meat(productName, price, stock);
    }
}
