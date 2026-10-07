
/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/
import java.util.LinkedList;

public class Store {
  private double profit;
  private LinkedList<ItemForSale> items;

  public Store() {
    profit = 0;
    items = new LinkedList<ItemForSale>();
  }

  // Precondition: The Store contains a list of items
  // Postcondition: All items currently for sale are displayed
  public void showItems() {
    for (ItemForSale item : items) {
      System.out.println(item.getName() + " - $" + item.getPrice());
    }
  }

  // Precondition: item is a valid ItemForSale object
  // Postcondition: item is added to the store's list of items
  public void addItem(ItemForSale item) {
    items.add(item);
  }

  // Precondition: itemName is the name of an item in the store
  // Postcondition: The matching item is removed and its price is added to profit
  public void sellItem(String itemName) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i).getName().equalsIgnoreCase(itemName)) {
        profit += items.get(i).getPrice();
        items.remove(i);

        System.out.println(itemName + " was sold.");
        return;
      }
    }

    System.out.println("Item not found.");
  }

  // Precondition: itemName is the name of an item in the store
  // Postcondition: The creator of the item is displayed
  public void creator(String itemName) {
    for (ItemForSale item : items) {
      if (item.getName().equalsIgnoreCase(itemName)) {
        if (item instanceof Book) {
          Book book = (Book) item;
          System.out.println(book.getAuthor().getName());
        } else if (item instanceof Movie) {
          Movie movie = (Movie) item;
          System.out.println(movie.getCreator());
        }

        return;
      }
    }

    System.out.println("Item not found.");
  }

  // Precondition: The Store object exists
  // Postcondition: Returns the store's current profit
  public double getProfit() {
    return profit;
  }

  // Precondition: profit is a valid double value
  // Postcondition: The store's profit is changed to profit
  public void setProfit(double profit) {
    this.profit = profit;
  }

  // Precondition: The Store object exists
  // Postcondition: Returns the LinkedList containing the store's items
  public LinkedList<ItemForSale> getItems() {
    return items;
  }

  // Precondition: items is a valid LinkedList of ItemForSale objects
  // Postcondition: The store's item list is changed to items
  public void setItems(LinkedList<ItemForSale> items) {
    this.items = items;
  }
}