package uts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StockManagement {
  private List<Item> items;

  public StockManagement() {
    items = new ArrayList<>();
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public void displayItems() {
    for (Item item : items) {
      System.out.println(item);
    }
  }

  public void sortItemsByStockAscending() {
    Collections.sort(items, (i1, i2) -> Integer.compare(i1.getStock(), i2.getStock()));
  }

  public void displayFoodItemsWithNoStock() {
    for (Item item : items) {
      if (item.getCategory().equalsIgnoreCase("food") && item.getStock() == 0) {
        System.out.println(item);
      }
    }
  }

  public void searchItemByName(String keyword) {
    for (Item item : items) {
      if (item.getName().toLowerCase().contains(keyword.toLowerCase())) {
        System.out.println(item);
      }
    }
  }

  public void addStockForItem(String itemCode, int quantity) {
    for (Item item : items) {
      if (item.getItemCode().equals(itemCode)) {
        item.setStock(item.getStock() + quantity);
        break;
      }
    }
  }

  public void decreaseStockForItem(String itemCode, int quantity) {
    for (Item item : items) {
      if (item.getItemCode().equals(itemCode)) {
        if (item.getStock() >= quantity) {
          item.setStock(item.getStock() - quantity);
        } else {
          System.out.println("Error: Insufficient stock");
        }
        break;
      }
    }
  }

  public void addItemWithUserInput() {
    Scanner scanner = new Scanner(System.in);
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
    items.add(newItem);
  }
}