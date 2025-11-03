package Factory.Products;

public class MeatFactory implements ProductFactory {

    @Override
    public Product create(String productName, int price, int stock) {
        return new Meat(productName, price, stock);
    }
}
