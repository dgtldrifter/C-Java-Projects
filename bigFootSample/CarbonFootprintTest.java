
/**
 * Write a description of class CarbonFootprintTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarbonFootprintTest
{
    public static void main(String[] args)
    {
        CarbonFootprint[] list = new CarbonFootprint[6];
    
        //adds elements to array
        list[0] = new Bicycle();
        list[1] = new Skateboard();
        list[2] = new Building(6000);
        list[3] = new Car(20);
        list[4] = new Whale(3.25);
        list[5] = new Burger(35);
        
        //display footprint of each item in the list
        for (int x = 0; x < list.length; x++)
        {
            list[x].GetCarbonFootprint();
        }
    }
}
