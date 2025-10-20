package CoR;

import Factory.Products.Product;
import core.Customer;

public class CheckStock extends BaseHandler {
    String outStock;

    @Override
    public void handle(Customer customer) {
        boolean accepted = true;

        for (Product item : customer.getOrder()) {
            if (item.getStock() <= 0) {
                accepted = false;
                outStock = item.getProductName();
                break;
            }
        }

        if (accepted) {
            System.out.println(" ~ Stock check completed.");
            handleNext(customer);
        }
        else {
            System.out.println("[!] " + outStock + " is out of stock!");
        }
    }
}
