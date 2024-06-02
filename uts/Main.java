package uts;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StockManagement stockManagement = new StockManagement();

        // Add items
        stockManagement.addItem(new Item("16030927", "Indomilk", "drink", 100));
        stockManagement.addItem(new Item("16100617", "Sprite", "drink", 70));
        stockManagement.addItem(new Item("16240401", "Yakult", "drink", 500));
        stockManagement.addItem(new Item("16270525", "Indomie", "food", 250));
        stockManagement.addItem(new Item("16971204", "Oreo", "food", 320));
        stockManagement.addItem(new Item("16100727", "Chocochips", "food", 120));
        stockManagement.addItem(new Item("16460329", "Ballpoint", "stationary", 75));
        stockManagement.addItem(new Item("16320421", "Pencil", "stationary", 110));
        stockManagement.addItem(new Item("16180729", "Book", "stationary", 57));

        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("\nChoose a feature:");
                System.out.println("1. Input/add Item data");
                System.out.println("2. Display all Item data");
                System.out.println("3. Sort Item data based on the stock values in ascending mode");
                System.out.println("4. Display Items data classified as food that have no stock");
                System.out.println("5. Search Item data based on the name keyword");
                System.out.println("6. Add the stock for certain Item");
                System.out.println("7. Decrease the stock for certain Item");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline character

                switch (choice) {
                    case 1:
                        // Input/add Item data
                        System.out.print("Enter item code: ");
                        String itemCode = scanner.nextLine();

                        System.out.print("Enter item name: ");
                        String itemName = scanner.nextLine();

                        System.out.print("Enter item category: ");
                        String itemCategory = scanner.nextLine();

                        System.out.print("Enter initial stock: ");
                        int initialStock = scanner.nextInt();
                        scanner.nextLine(); // consume newline character

                        Item newItem = new Item(itemCode, itemName, itemCategory, initialStock);
                        stockManagement.addItem(newItem);
                        break;
                    case 2:
                        // Display all Item data
                        System.out.println("All items:");
                        stockManagement.displayItems();
                        break;
                    case 3:
                        // Sort Item data based on the stock values in ascending mode
                        System.out.println("\nItems sorted by stock (ascending):");
                        stockManagement.sortItemsByStockAscending();
                        stockManagement.displayItems();
                        break;
                    case 4:
                        // Display Items data classified as food that have no stock
                        System.out.println("\nItems classified as food that have no stock:");
                        stockManagement.displayFoodItemsWithNoStock();
                        break;
                    case 5:
                        // Search Item data based on the name keyword
                        System.out.print("\nEnter name keyword: ");
                        String keyword = scanner.nextLine();
                        System.out.println("\nSearch results:");
                        stockManagement.searchItemByName(keyword);
                        break;
                    case 6:
                        // Add stock for certain Item
                        System.out.println("\nAdd stock for certain item:");
                        System.out.print("Enter item code: ");
                        String itemCode2 = scanner.nextLine();
                        System.out.print("Enter quantity to add: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine(); // consume newline character
                        stockManagement.addStockForItem(itemCode2, quantity);
                        System.out.println("Stock added successfully.");
                        break;
                    case 7:
                        // Decrease stock for certain item
                        System.out.println("\nDecrease stock for certain item:");
                        System.out.print("Enter item code: ");
                        String itemCode3 = scanner.nextLine();
                        System.out.print("Enter quantity to decrease: ");
                        int quantity2 = scanner.nextInt();
                        scanner.nextLine(); // consume newline character
                        stockManagement.decreaseStockForItem(itemCode3, quantity2);
                        System.out.println("Stock decreased successfully.");
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        // scanner.close(); // Removed for now
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
