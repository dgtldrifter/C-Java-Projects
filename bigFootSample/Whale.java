
/**
 * Write a description of class Whale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Whale implements CarbonFootprint
{
    private double year;
    
    public Whale(double year)
    {
        this.year = year;
    }
    
    //1 year of breathing yeilds 166 pounds of CO2
    public void GetCarbonFootprint()
    {
        System.out.printf("A whale that has lived %.2f years has exhaled %.2f pounds of CO2.\n",
        year, year * 166);
    }
}
