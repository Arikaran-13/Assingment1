package Abstract_package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DessertShop {
    static Scanner sc = new Scanner(System.in);
    static List<String> storage = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter your role: ");

            String str = sc.nextLine();

            if (str.equals("customer")) {

                placeorder();

            } else if (str.equals("owner")) {

                addProduct();
            }
            System.out.println("To continue the process press 1 or to end press 0");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 0) {
                System.exit(0);
            }
        }


    }

    private static void placeorder() {
        System.out.println("-----------------MENU---------------------------");
        System.out.println("1) Candy");
        System.out.println("2) Cookie");
        System.out.println("3) IceCookie");
        System.out.println("------------------");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter the number of quantity: ");
            int q = sc.nextInt();
            System.out.println("order placed succesfully");
            Candy candy = new Candy();
            System.out.println("Generating bill...");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Error while placing an order");
            }
            System.out.println("Your Bill Amount is : " + q * candy.getCost() + " Rs");

        } else if (choice == 2) {
            System.out.println("Enter the number of quantity: ");
            int q = sc.nextInt();
            System.out.println("order placed succesfully");
            System.out.println("Generating bill...");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Error while placing an order");
            }
            Cookie cookie = new Cookie();
            System.out.println("Your Bill amount is : " + q * cookie.getCost() + " RS");
            System.out.println("Ordered deleivered");

        } else if (choice == 3) {
            System.out.println("Enter the number of quantity: ");
            int q = sc.nextInt();
            System.out.println("order placed succesfully");
            System.out.println("Generating bill...");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Error while placing an order");
            }
            IceCookie icecookie = new IceCookie();
            System.out.println("Your Bill amount is : " + q * icecookie.getCost() + " Rs");
            System.out.println("Ordered deleivered");
        } else {
            System.out.println("Check the options and enter the correct one");
            System.exit(0);
        }

    }

    public static void addProduct() {


        System.out.println("Select the product to add in the storage");
        System.out.println("1) Candy");
        System.out.println("2) Cookie");
        System.out.println("3) IceCookie");
        int op = sc.nextInt();
        if (op == 1) storage.add("Candy");
        else if (op == 2) storage.add("Cookie");
        else if (op == 3) storage.add("IceCookie");
        else {
            System.out.println("Please select the correct product");
            System.exit(0);
        }
        System.out.println("Added successfully to the storage");
        System.out.println("To view the storage item press1 and to exit press any number");
        int ch = sc.nextInt();
        if (ch == 1) {
            for (String i : storage) {
                System.out.println(i);
            }
        } else {
            System.exit(0);
        }

    }

}

abstract class DessertItem {

    public abstract int getCost();

}

class Candy extends DessertItem {

    @Override
    public int getCost() {
        return 60;
    }
}

class Cookie extends DessertItem {

    @Override
    public int getCost() {
        return 70;
    }
}

class IceCookie extends DessertItem {

    @Override
    public int getCost() {
        return 45;
    }
}