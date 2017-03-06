
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car implements CarbonFootprint
{
    private double gallons;
    
    public Car(double gallons)
    {
        this.gallons = gallons;
    }
    
    //one gallon of gas yeilds 20 pounds of CO2
    //www.enviroduck.com
    public void GetCarbonFootprint()
    {
        System.out.printf("Car that has used %.2f gallons of gas %.2f\n",
        gallons, gallons * 20);
    }
}
