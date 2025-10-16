package Factory.Products;

public class Meat implements Product {
    private final String type;
    private final String productName;
    private int price;

    public Meat(String productName, int price) {
        this.type = "Meat";
        this.productName = productName;
        this.price = price;
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
}
