import Factory.Products.Product;
import Observer.OnSale;
import Observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Subscriber {
    private final String name;
    private final int age;
    List<Product> order = new ArrayList<Product>();

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addProduct(Product product) {
        order.add(product);
    }

    public void removeProduct(Product product) {
        order.remove(product);
    }

    public void orderList() {
        System.out.println("\n[Order List] : " + name);

        if (order.isEmpty()) {
            System.out.println("No products in order.");
            return;
        }

        for (Product product : order) {
            System.out.println(" ~ " + product.getProductName() + " (" + product.getPrice() + "Ft)");
        }
    }

    @Override
    public void update(OnSale onsale) {
        System.out.println("🔔 " + name + ":\t" + onsale.getProduct().getProductName() + " is now on sale for " + onsale.getSalePrice() +"Ft!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
