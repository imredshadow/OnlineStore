public class Book extends ItemForSale
{
    private Author author;
    private String publisher;

    public Book(){
        this.author = new Author();
        this.publisher = "";
    }

    //Precondition: The Book object exists
    //Postcondition: Returns the author of the book
    public Author getAuthor(){
        return author;
    }

    //Precondition: author is an Author object
    //Postcondition: The book's author is changed to author
    public void setAuthor(Author author){
        this.author = author;
    }

    //Precondition: The Book object exists
    //Postcondition: Returns the publisher of the book
    public String getPublisher(){
        return publisher;
    }

    //Precondition: publisher is a String
    //Postcondition: The book's publisher is changed to publisher
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
}