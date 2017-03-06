
/**
 * Write a description of class NumberNotFoundException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberNotFoundException extends Exception
{
    
    
    //no-argument constructor specifies default error message
    public NumberNotFoundException()
    {
        super("Number not found in array");
    }
    
    //constructor to alolow custormized error message
    public NumberNotFoundException(String message)
    {
        super(message);
    }
}
