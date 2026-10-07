//Name: Jian Acol
//PD: 7
//Description: A simple store system with books and movies are sold that each has their own information/attributes
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        Book b = new Book();
        System.out.println(b instanceof ItemForSale);

      //Set information for the book
      b.setName("Harry Potter");
      b.setPrice(20.00);
      b.setDateOnSale("October 1, 2026");

      Author a = new Author();
      a.setName("J.K. Rowling");
      a.setDateOfBirth("July 31, 1965");

      b.setAuthor(a);
      b.setPublisher("Bloomsbury");

      //Add book to store
      s.addItem(b);

      //Test showItems()
      System.out.println("Items:");
      s.showItems();

      //Test creator()
      System.out.println("Creator:");
      s.creator("Harry Potter");

      //Test sellItem()
      s.sellItem("Harry Potter");

      // Test profit
      System.out.println("Profit: $" + s.getProfit());

      //Test Movie
      Movie m = new Movie();
      m.setName("Inception");
      m.setPrice(15.00);
      m.setDateOnSale("October 2, 2026");
      m.setCreator("Christopher Nolan");
      m.setDuration(148);

      s.addItem(m);

      //Test Movie creator
      System.out.println("Movie Creator:");
      s.creator("Inception");

      //Test Movie in the store
      System.out.println("Items:");
      s.showItems();
     }
}
