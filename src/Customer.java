import Observer.OnSale;
import Observer.Stock;
import Observer.Subscriber;

public class Customer implements Subscriber {
    private final String name;
    private final int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void update(Stock stock) {
        if (stock.getQuantity() == 0)
            System.out.println("📦 " + name + ":\t" + stock.getProductName() + " is out of stock!");
        else
            System.out.println("📦 " + name + ":\t" + stock.getProductName() + " is now available again!");
    }

    @Override
    public void update(OnSale onsale) {
        System.out.println("🔥 " + name + ":\t" + onsale.getStock().getProductName() + " is now on sale for " + onsale.getSalePrice() +"$!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
