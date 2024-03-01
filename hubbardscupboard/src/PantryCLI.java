import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashSet;
public class PantryCLI {
    private Pantry pantry;
    private Scanner scnr = new Scanner(System.in);


    public void start() {
        // Starting point for menu interactions
        System.out.println("\n********************************************************************");
        System.out.println("Welcome to Hubbard's Cubpoard, a personal kitchen inventory service.\n");
        mainMenu();
    }
    public void mainMenu() {
        // Main menu for CLI
        printMainMenu();
        while (true) {
            System.out.println("Enter your choice. Type q to quit or m to see menu.");
            String menu_choice = scnr.nextLine();
            switch(menu_choice) {
                case "1":
                    print();
                    break;

                case "2":
                    edit();
                    break;

                case "3":
                    reviewInStock();
                    break;

                case "4":
                    reviewToBuy();
                    break;

                case "q":
                    return;

                case "m":
                    printMainMenu();

                default:
                    System.out.println("Input invalid. Please try again.");

            }


        }

    }



    private void printMainMenu() {
        String menu = """
                      1. Print
                      2. Edit list
                      3. Review what's in stock
                      4. Review what to buy
                      """;
        System.out.print(menu);
    }

    private void print() {
        // Choose what to print
        // 1. Print all
        // 2. Print in stock
        // 3. Print to buy
    }

    private void edit() {
        // Choose what to edit
        // 1. Add new categories
        // 2. Edit categories (includes delete)
        // 3. Add items
        // 4. Edit item (includes delete)
    }


    private void addCategory() {
        // Create a new category
    }
    private void editCategories() {
        // Choose category to edit
        // Edit name or delete
    }

    private void addItem() {
        // Walk through process of adding an item
        // name
        // category
    }

    private void editItem() {
        // Choose item to edit
        // Choose what to edit (name, category, status maybe) including delete
    }

    private void reviewInStock() {
        // Walks you through each item and gives you the option to mark as low stock or out of stock (both will add to the shopping list)
    }

    private void reviewToBuy() {
        // Walks you through each item and give you the option to make as in stock (because you bought it)
    }

}
