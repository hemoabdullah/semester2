package uts;
public class Item {
    private String itemCode;
    private String name;
    private String category;
    private int stock;
  
    public Item(String itemCode, String name, String category, int stock) {
      this.itemCode = itemCode;
      this.name = name;
      this.category = category;
      this.stock = stock;
    }
  
    public String getItemCode() {
      return itemCode;
    }
  
    public void setItemCode(String itemCode) {
      this.itemCode = itemCode;
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public String getCategory() {
      return category;
    }
  
    public void setCategory(String category) {
      this.category = category;
    }
  
    public int getStock() {
      return stock;
    }
  
    public void setStock(int stock) {
      this.stock = stock;
    }
  
    @Override
    public String toString() {
      return "Item{" +
          "itemCode='" + itemCode + '\'' +
          ", name='" + name + '\'' +
          ", category='" + category + '\'' +
          ", stock=" + stock +
          '}';
    }
  }