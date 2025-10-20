package CoR;

import core.Customer;

public abstract class BaseHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    public void handleNext(Customer customer) {
        if (next != null) {
            next.handle(customer);
        }
        else {
            System.out.println("\n$ Every check is successful! Order is in progress.");
        }
    }
}
