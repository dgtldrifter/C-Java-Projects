
/**
 * Write a description of class AnimalStoreMW here.
 * A traslation of the C++ animal store program from September. 
 * @author Micheal Walburn 
 */
import java.util.Scanner;
public class AnimalStoreMW
{
    //public variables
    public static int choice = 0;
    public static double total = 0.0;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int loop = 0;
        int yn = 0;
        do
        {
            System.out.println("Bubba's Extinct Animal Store");
            System.out.printf("%n");
            System.out.println("Please choose from the following animals: ");
            System.out.println("1. Dodo Bird");
            System.out.println("2. Pterodactyl");
            System.out.println("3. Wooly Mammoth");
            System.out.println("4. Megalodon");
            System.out.println("5. Sabre-Tooth Tiger");
            System.out.println("6. Food Menu for the above animals");
            choice = input.nextInt();
            System.out.printf("%n");
            //allows choices to be made
            while(choice > 0)
            {
                if (choice == 6)
                {
                    foodMenu.foodMenu(choice);
                }//end if
                
                purchasemenu.purchase(choice);
                choice = 0;
                
                
            }//end while
            System.out.printf("%n");
            System.out.printf("Do you want to continue shopping? 0 for yes or 1 for no");
            loop = input.nextInt();
             
        }while (loop == 0); //end do-while
        
    }//end main
    
   
    
    
}
