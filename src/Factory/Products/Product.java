package Factory.Products;

public interface Product {
    public abstract String getProductName();
    public abstract int getPrice();
    public abstract void setPrice(int cost);
    public abstract int getStock();
    public abstract void setStock(int cost);
    public abstract String getType();
}
