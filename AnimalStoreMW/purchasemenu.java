
/**
 * Write a description of class purchasemenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class purchasemenu
{
    public static void purchase(int choice)
    {
        //variables
        
        choice = choice;
        Scanner input = new Scanner(System.in);
        double dodo = 100000.00;
        double pterodactyl = 1.00;
        double wMammoth = 2000000000.00;
        double megalodon = 500000.00;
        double sabreTooth = 300.00;
        double subtotal = 0.0;
        int quantity = 0;
        int food = 0;
        
        //allows choices to be made
        switch (choice)
        {
            case 1:
            {
                System.out.printf("How many Dodo Birds would you like to purchase at $%.2f?%n", dodo);
                System.out.printf("%n");
                quantity = input.nextInt();
                subtotal += quantity * dodo;
                System.out.printf("Your subtotal for Dodo Birds is $%.2f.%n", subtotal);
                AnimalStoreMW.total += subtotal;
                System.out.printf("Your current total is $%.2f. %n", AnimalStoreMW.total);
                subtotal = 0.0;
                break;
                //math to figure out total and then stack it
            }//ends case 1
            case 2:
            {
                System.out.printf("How many Pterodactyl would you like to purchase at $%.2f?%n", pterodactyl);
                System.out.printf("%n");
                quantity = input.nextInt();
                subtotal += quantity * pterodactyl;
                System.out.printf("Your subtotal for Dodo Birds is $%.2f.%n", subtotal);
                AnimalStoreMW.total += subtotal;
                System.out.printf("Your current total is $%.2f. %n", AnimalStoreMW.total);
                subtotal = 0.0;
                break;
                //math to figure out total and then stack it
            }//ends case2
            case 3:
            {
                System.out.printf("How many Wooly Mammoths would you like to purchase at $%.2f?%n", wMammoth);
                System.out.printf("%n");
                quantity = input.nextInt();
                subtotal += quantity * wMammoth;
                System.out.printf("Your subtotal for Dodo Birds is $%.2f.%n", subtotal);
                AnimalStoreMW.total += subtotal;
                System.out.printf("Your current total is $%.2f. %n", AnimalStoreMW.total);
                subtotal = 0.0;
                break;
                //math to figure out total and then stack it
            }//ends case 3
            case 4:
            {
                System.out.printf("How much Megalodon would you like to purchase at $%.2f?%n", megalodon);
                System.out.printf("%n");
                quantity = input.nextInt();
                subtotal += quantity * megalodon;
                System.out.printf("Your subtotal for Dodo Birds is $%.2f.%n", subtotal);
                AnimalStoreMW.total += subtotal;
                System.out.printf("Your current total is $%.2f. %n", AnimalStoreMW.total);
                subtotal = 0.0;
                break;
                //math to figure out total and then stack it
            }//ends case 4
            case 5:
            {
                System.out.printf("How many Sabre-Toothed Tigers would you like to purchase at $%.2f?%n", sabreTooth);
                System.out.printf("%n");
                quantity = input.nextInt();
                subtotal += quantity * sabreTooth;
                System.out.printf("Your subtotal for Dodo Birds is $%.2f.%n", subtotal);
                AnimalStoreMW.total += subtotal;
                System.out.printf("Your current total is $%.2f. %n", AnimalStoreMW.total);
                subtotal = 0.0;
                break;
                //math to figure out total and then stack it
            }//ends 5
            case 6:
            default:
            {
                System.out.println("Did you remember to get food for your pet? ");
                System.out.printf("%n");
                System.out.println("Please choose which type of pet you would like to get food for: ");
                System.out.println("1. Dodo Bird");
                System.out.println("2. Pterodactyl");
                System.out.println("3. Wooly Mammoth");
                System.out.println("4. Megalodon");
                System.out.println("5. Sabre-Tooth Tiger");
                food = input.nextInt();
                //if choice is 6 returns to different menu
                if (choice == 6)
                {
                    foodMenu.foodMenu(food);
                }//returs to prevoius menu
                break;
            }//ends case 6/default
        }//ends switch 
        
    }
}
