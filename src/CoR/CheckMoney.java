package CoR;

import Factory.Products.Product;
import core.Customer;

public class CheckMoney extends BaseHandler {

    @Override
    public void handle(Customer customer) {
        boolean accepted = true;
        int totalPrice = 0;

        for (Product item : customer.getOrder()) {
            totalPrice += item.getPrice();
        }

        if (totalPrice >= customer.getMoney()) {
            accepted = false;
        }

        if (accepted) {
            System.out.println(" ~ Money check completed.");
            customer.setMoney(customer.getMoney() - totalPrice);
            handleNext(customer);
        }
        else {
            System.out.println("[!] There is not enough money in your wallet.");
        }
    }
}
