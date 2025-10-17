package Factory.Products;

public class Meat implements Product {
    private final String type;
    private final String productName;
    private int price;
    private int stock;

    public Meat(String productName, int price, int stock) {
        this.type = "Meat";
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
