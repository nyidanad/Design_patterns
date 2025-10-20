package utils;

import Factory.Products.Product;
import core.Customer;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Screens {
    Scanner input = new Scanner(System.in);

    public Customer screenCustomerDetails() {
        String name;
        int age;
        int money;

        Terminal.clear();
        Terminal.title("Customer Details");

        System.out.print("$ » name: ");
        name = input.nextLine();
        System.out.print("$ » age: ");
        age = Integer.parseInt(input.nextLine());
        System.out.print("$ » money: ");
        money = Integer.parseInt(input.nextLine());

        return new Customer(name, age, money);
    }

    public void screenHome() {
        Terminal.clear();
        Terminal.title("HOME");

        System.out.println("[1] Add");
        System.out.println("[2] Remove");
        System.out.println("[3] Cashout");
        System.out.println("[4] Exit\n");
    }

    public void addScreen(Customer customer, List<Product> products) {
        Terminal.clear();
        Terminal.title("ADD PRODUCT");

        int choice;

        for (int i = 0; i < products.size(); i++) {
            System.out.println("[" + (i+1) + "] " + products.get(i).getProductName() + " (" + products.get(i).getPrice() + ")");
        }

        System.out.print("\nChoose a product no.: ");
        choice = input.nextInt();

        customer.addProduct(products.get(choice-1));
        screenHome();
    }

    public void removeScreen(Customer customer) {
        Terminal.clear();
        Terminal.title("REMOVE FROM ORDER");

        Scanner key = new Scanner(System.in);

        if (customer.getOrder().isEmpty()) {
            System.out.println("No products in order.");
            System.out.println("\nPress any key to go back.");
            key.nextLine();
        }
        else {
            for (int i = 0; i < customer.getOrder().size(); i++) {
                System.out.println("[" + (i+1) + "] " + customer.getOrder().get(i).getProductName() + " (" + customer.getOrder().get(i).getPrice() + ")");
            }

            System.out.print("\nChoose a product no.: ");
            int choice = input.nextInt();

            customer.removeProduct(customer.getOrder().get(choice-1));
        }

        screenHome();
    }
}
