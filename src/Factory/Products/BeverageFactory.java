package Factory.Products;

public class BeverageFactory implements ProductFactory {

    @Override
    public Product create(String productName, int price, int stock) {
        return new Beverage(productName, price, stock);
    }
}
