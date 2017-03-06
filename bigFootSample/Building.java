
/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building implements CarbonFootprint
{
    private int squareFeet;
    
    public Building(int squareFeet)
    {
        this.squareFeet = squareFeet;
    }
    
    //formula found on internet
    public void GetCarbonFootprint()
    {
        System.out.printf("Building with %d square feet: %d\n", 
        squareFeet, squareFeet * (50 + 20 + 47 + 17));
    }
}
