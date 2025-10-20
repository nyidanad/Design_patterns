package CoR;

import Factory.Products.Product;
import core.Customer;
import utils.Terminal;

public class CheckAge extends BaseHandler{

    @Override
    public void handle(Customer customer) {
        boolean accepted = true;

        Terminal.clear();
        Terminal.title("HANDLING CHECKOUT");

        for (Product item : customer.getOrder()) {
            if (item.getType().equals("Beverage") && customer.getAge() < 18) {
                accepted = false;
                break;
            }
        }

        if (accepted) {
            System.out.println(" ~ Age check completed.");
            handleNext(customer);
        }
        else {
            System.out.println("[!] Not allowed to buy alcoholic products.");
        }
    }
}
