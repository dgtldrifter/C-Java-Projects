
/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burger implements CarbonFootprint
{
    private double burger;
    
    public Burger(double burger)
    {
        this.burger = burger;
    }
    
    //1 burger of burgers yeilds 6.8 pounds of CO2
    //the internet
    public void GetCarbonFootprint()
    {
        System.out.printf("If you ate %.2f burgers they would emit %.2f pounds of CO2.\n",
        burger, burger * 6.8);
    }
}
