package Factory.Products;

public class SideFactory implements ProductFactory {

    @Override
    public Product create(String productName, int price, int stock) {
        return new Side(productName, price, stock);
    }
}
