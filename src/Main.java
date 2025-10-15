import Observer.OnSale;
import Observer.Stock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("John", 18);
        Customer c2 = new Customer("Alice", 23);

        // STOCK PRODUCTS
        Stock asus_laptop_stock = new Stock("Asus Laptop", 15, 1800);
        Stock msi_laptop_stock = new Stock("MSI Laptop", 10, 1699);

        // ON SALE PRODUCTS
        OnSale msi_laptop_sale = new OnSale(msi_laptop_stock);

        // SUBSCRIBERS
        asus_laptop_stock.subscribe(c1);
        msi_laptop_sale.subscribe(c2);

        // CHANGES
        asus_laptop_stock.setQuantity(0);
        msi_laptop_sale.setSalePrice(1200);
        asus_laptop_stock.setQuantity(30);
    }
}