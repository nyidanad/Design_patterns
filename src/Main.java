import Factory.Products.*;
import Observer.OnSale;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("John", 18);
        Customer c2 = new Customer("Alice", 23);

        // PRODUCTS
        Product Beef = new Meat("Beef", 8000);
        Product Miller = new Beverage("Miller", 450);
        Product Frenchfrise = new Side("French fries", 780);

        // ON SALE PRODUCTS
        OnSale Beef_sale = new OnSale(Beef);
        OnSale Miller_sale = new OnSale(Miller);

        // SUBSCRIBERS
        Beef_sale.subscribe(c2);
        Miller_sale.subscribe(c1);

        // CHANGES
        Beef_sale.setSalePrice(7600);
        Miller_sale.setSalePrice(380);

        // CUSTOMER ORDERS
        c1.addProduct(Beef);
        c1.addProduct(Frenchfrise);
        c1.addProduct(Miller);
        c1.orderList();
    }
}