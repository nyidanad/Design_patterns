package Factory.Products;

public class SideFactory implements ProductFactory {
    private final String productName;
    private final int price;

    public SideFactory(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public Product create() {
        return new Side(productName, price);
    }
}
