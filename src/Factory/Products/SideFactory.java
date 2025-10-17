package Factory.Products;

public class SideFactory implements ProductFactory {
    private final String productName;
    private final int price;
    private final int stock;

    public SideFactory(String productName, int price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public Product create() {
        return new Side(productName, price, stock);
    }
}
