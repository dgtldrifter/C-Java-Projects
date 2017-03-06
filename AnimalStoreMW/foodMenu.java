
/**
 * Write a description of class foodMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class foodMenu
{
     public static void foodMenu(int food)
    {
        //variables
        
        food = food;
        Scanner input = new Scanner(System.in);
        double seeds = 1.00;
        double berries = 2.00;
        double watermelon = 10.00;
        double cannedUnicorn = 6.25;
        double eggs = 2.14;
        double deer = 5.99;
        double meerkat = 20.94;
        double whale = 2.39;
        double people = 100.00;
        double ants = 0.01;
        double turtles = 37.67;
        double sloth = 3000.00;
        double rocks = 50.00;
        double wood = 750.00;
        double cyanide = 900.00;
        double subtotal = 0.0;
        int quantity = 0;
        int type = 0;
        
        switch (food)
        {
            case 1:
            {
                System.out.println("Which type of food would you like to purchase for your dodo?");
                System.out.println("1. Seeds");
                System.out.println("2. Berries");
                System.out.println("3. Watermelon");
                System.out.printf("%n");
                type = input.nextInt();
                //different food choices
                
                if (type == 1)
                {
                    System.out.printf("How many seeds would you like to purchase at $%.2f?%n", seeds);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (seeds * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for seeds is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//end if 1
                
                if (type == 2)
                {
                    System.out.printf("How many berries would you like to purchase at $%.2f?%n", berries);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (berries * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for berries is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//end if 2
                
                if (type == 3)
                {
                    System.out.printf("How many watermelon would you like to purchase at $%.2f?%n", watermelon);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (watermelon * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for watermelon is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//end if 3
                break;
            }//ends case 1
            
            case 2:
            {
                System.out.println("Which type of food would you like to purchase for your pterodactyl?");
                System.out.println("1. Canned Unicorn");
                System.out.println("2. Eggs");
                System.out.println("3. Deer");
                type = input.nextInt();
                System.out.printf("%n");
                //different food optiopns
                
                if (type == 1)
                {
                    System.out.printf("How much canned unicorn would you like to purchase at $%.2f?%n", cannedUnicorn);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (cannedUnicorn * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for seeds is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//ends if 1
                
                if (type == 2)
                {
                    System.out.printf("How many eggs would you like to purchase at $%.2f?%n", eggs);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (eggs * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for berries is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//ends if 2
                
                if (type == 3)
                {
                    System.out.printf("How much deer would you like to purchase at $%.2f?%n", deer);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (deer * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for watermelon is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//ends if 2
                break;
            }//ends case 3
            
            case 3:
            {
                System.out.println("Which type of food would you like to purchase for your wooly mammoth?");
                System.out.println("1. Meerkat");
                System.out.println("2. Whale");
                System.out.println("3. People");
                type = input.nextInt();
                System.out.printf("%n");
                //options for different foods 
                if (type == 1)
                {
                    System.out.printf("How many meerkats would you like to purchase at $%.2f?%n", meerkat);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (meerkat * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for seeds is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//ends if 1
                
                if (type == 2)
                {
                    System.out.printf("How much whale would you like to purchase at $%.2f?%n", whale);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (whale * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for berries is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//ends if 2
                
                if (type == 3)
                {
                    System.out.printf("How many people would you like to purchase at $%.2f?%n", people);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (people * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for watermelon is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//ends if 3
                break;
            }//ends case
            
            case 4:
            {
                System.out.println("Which type of food would you like to purchase for your megalodon?");
                System.out.println("1. Rocks");
                System.out.println("2. Wood");
                System.out.println("3. Cyanide");
                type = input.nextInt();
                System.out.printf("%n");
                //allows different choices for food
                
                if (type == 1)
                {
                    System.out.printf("How many rocks would you like to purchase at $%.2f?%n", rocks);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (rocks * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for seeds is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//ends if 1
                
                if (type == 2)
                {
                    System.out.printf("How much wood would you like to purchase at $%.2f?%n", wood);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (wood * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for berries is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//ends if 2
                
                if (type == 3)
                {
                    System.out.printf("How much cyanide would you like to purchase at $%.2f?%n", cyanide);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (cyanide * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for watermelon is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//ends if 3
                break;
            }//ends case 4
            
            case 5:
            {
                System.out.println("Which type of food would you like to purchase for your Sabre-tooth?");
                System.out.println("1. Ants");
                System.out.println("2. Turtles");
                System.out.println("3. Sloth");
                type = input.nextInt();
                System.out.printf("%n");
                //choices for specific tye of food
                if (type == 1)
                {
                    System.out.printf("How many ants would you like to purchase at $%.2f?%n", ants);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (ants * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for seeds is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//ends if 1
                
                if (type == 2)
                {
                    System.out.printf("How many turtles would you like to purchase at $%.2f?%n", turtles);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (turtles * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for berries is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//ends if 2
                
                if (type == 3)
                {
                    System.out.printf("How much sloth would you like to purchase at $%.2f?%n", sloth);
                    System.out.printf("%n");
                    quantity = input.nextInt();
                    subtotal += (sloth * quantity);
                    quantity = 0;
                    System.out.printf("Your subtotal for watermelon is $%.2f.%n", subtotal);
                    AnimalStoreMW.total += subtotal;
                    System.out.printf("Your current total today is $%.2f.%n", AnimalStoreMW.total);
                    subtotal = 0.0;
                    //math to figure out total and then stack it
                }//ends if 3
                break;
            }//end case
            
        }//ends switch

    }
}
