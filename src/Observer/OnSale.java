package Observer;

import java.util.ArrayList;
import java.util.List;

public class OnSale {
    private String productName;
    private int price;
    List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public OnSale(String productName, int price) {
        this.productName = productName;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
