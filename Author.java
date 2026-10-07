public class Author
{
    private String name;
    private String dateOfBirth;

    public Author(){
        this.name = "";
        this.dateOfBirth = "";
    }

    //Precondition: The Author object exists
    //Postcondition: Returns the author's name
    public String getName(){
        return name;
    }

    //Precondition: name is a String
    //Postcondition: The author's name is changed to name
    public void setName(String name){
        this.name = name;
    }

    //Precondition: The Author object exists
    //Postcondition: Returns the author's date of birth
    public String getDateOfBirth(){
        return dateOfBirth;
    }

    //Precondition: dateOfBirth is a String
    //Postcondition: The author's date of birth is changed to dateOfBirth
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
}