public class Movie extends ItemForSale
{
    private String creator;
    private int duration;

    public Movie(){
        super();

        this.creator = "";
        this.duration = 0;
    }

    //Precondition: The Movie object exists
    //Postcondition: Returns the creator of the movie
    public String getCreator(){
        return creator;
    }

    //Precondition: creator is a String
    //Postcondition: The movie's creator is changed to creator
    public void setCreator(String creator){
        this.creator = creator;
    }

    //Precondition: The Movie object exists
    //Postcondition: Returns the duration of the movie in minutes
    public int getDuration(){
        return duration;
    }

    //Precondition: duration is a valid integer representing minutes
    //Postcondition: The movie's duration is changed to duration
    public void setDuration(int duration){
        this.duration = duration;
    }
}