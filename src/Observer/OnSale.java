package Observer;

import Factory.Products.Product;

import java.util.ArrayList;
import java.util.List;

public class OnSale {
    private final Product product;
    private int salePrice;
    List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public OnSale(Product product) {
        this.product = product;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscriber() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
        this.product.setPrice(salePrice);
        notifySubscriber();
    }

    public Product getProduct() {
        return product;
    }
}
