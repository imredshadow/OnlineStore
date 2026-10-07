public class ItemForSale
{
    private String name;
    private double price;
    private String dateOnSale;

    public ItemForSale(){
        this.name = "";
        this.price = 0;
        this.dateOnSale = "";
    }

    
    //Precondition: The ItemForSale object exists
    //Postcondition: Returns the name of the item
    public String getName(){
        return name;
    }

    //Precondition: name is a String.
    //Postcondition: The item's name is changed to name
    public void setName(String name){
        this.name = name;
    }

    //Precondition: The ItemForSale object exists
    //Postcondition: Returns the price of the item
    public double getPrice(){
        return price;
    }

    //Precondition: price is a valid double value
    //Postcondition: The item's price is changed to price
    public void setPrice(double price){
        this.price = price;
    }

    //Precondition: The ItemForSale object exists
    //Postcondition: Returns the date the item was placed on sale
    public String getDateOnSale(){
        return dateOnSale;
    }

    //Precondition: dateOnSale is a String.
    //Postcondition: The item's sale date is changed to dateOnSale.
    public void setDateOnSale(String dateOnSale){
        this.dateOnSale = dateOnSale;
    }
}