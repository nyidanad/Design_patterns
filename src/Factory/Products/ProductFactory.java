package Factory.Products;

public interface ProductFactory {
    public abstract Product create(String productName, int price, int stock);
}
