package CoR;

import core.Customer;

public interface Handler {
    public void setNext(Handler handler);
    public void handle(Customer customer);
}
