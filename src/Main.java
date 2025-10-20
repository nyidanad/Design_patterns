import CoR.CheckAge;
import CoR.CheckMoney;
import CoR.CheckStock;
import CoR.Handler;
import Factory.Products.*;
import Observer.OnSale;
import core.Customer;
import utils.Screens;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command;
        Screens screen = new Screens();

        Customer customer = screen.screenCustomerDetails();
        screen.screenHome();

        // FACTORIES
        ProductFactory factory1 = new MeatFactory("Beef", 8000, 0);
        ProductFactory factory2 = new BeverageFactory("Miller", 450, 25);
        ProductFactory factory3 = new SideFactory("French fries", 780, 16);

        // PRODUCTS
        List<Product> products = new ArrayList<Product>();
        products.add(factory1.create());
        products.add(factory2.create());
        products.add(factory3.create());

        // ON SALE PRODUCTS
        OnSale Beef_sale = new OnSale(products.get(0));
        OnSale Miller_sale = new OnSale(products.get(1));

        // HANDLERS
        Handler checkAge = new CheckAge();
        Handler checkStock = new CheckStock();
        Handler checkMoney = new CheckMoney();

        // CHAIN OF HANDLERS
        checkAge.setNext(checkStock);
        checkStock.setNext(checkMoney);

        // SUBSCRIBERS
        Beef_sale.subscribe(customer);
        Miller_sale.subscribe(customer);

        // SALES
        Beef_sale.setSalePrice(7600);
        Miller_sale.setSalePrice(380);

        while (true) {
            command = input.nextLine();

            switch (command) {
                case "1":
                    screen.addScreen(customer, products);
                    break;
                case "2":
                    screen.removeScreen(customer);
                    break;
                case "3":
                    checkAge.handle(customer);
                    input.nextLine();
                    screen.screenHome();
                    break;
                case "4":
                    System.exit(0);
            }

            customer.orderList();
        }
    }
}