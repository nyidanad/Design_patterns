package Observer;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private final String productName;
    private int quantity;
    private int price;
    List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public Stock(String productName, int quantity, int price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
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

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifySubscriber();
    }

    public int getPrice() {
        return price;
    }
}
