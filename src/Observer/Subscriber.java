package Observer;

public interface Subscriber {
    public void update(Stock stock);
    public void update(OnSale onsale);
}
