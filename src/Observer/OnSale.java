package Observer;

import java.util.ArrayList;
import java.util.List;

public class OnSale {
    private Stock stock;
    private int salePrice;
    List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public OnSale(Stock stock) {
        this.stock = stock;
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
        notifySubscriber();
    }

    public Stock getStock() {
        return stock;
    }
}
