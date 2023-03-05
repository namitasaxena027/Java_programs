import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
        
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Choclate chocolate = new Choclate();

        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing");
        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");

        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);
        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");
        redVelvet.type();
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        // Print "We are in the middle of creating the drink menu. We currently have three types of drinks on
        // the menu but we need to decide on pricing"
        System.out.println("We are in the middle of creating the drink menu. We currently have three types of drinks on the menu but we need to decide on pricing");

        // We do not need a scanner object here, because we will just use the one from before

        // Print "We are deciding on the price for our bottled water. Here is the description:"
        System.out.println("We are deciding on the price for our bottled water. Here is the description: ");
        // Call the type() method on the water object to get the description
        water.type();

        // Print "How much would you like to charge for the water bottle?
        // (Input a numerical number taken to 2 decimal places)"
        System.out.println("How much would you like to charge for the water bottle?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        // Set the String variable named priceText equal to input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        priceText = input.nextLine();

        // Set the double variable named price equal to Double.parseDouble(priceText)
        price = Double.parseDouble(priceText);

        // Now that we have the price, we can call the setPrice() method with the parameter of price on the water object
        water.setPrice(price);

        // Print "We are deciding on the price for our bottle of soda. Here is the description:"
        System.out.println("We are deciding on the price for our bottle of soda. Here is the description: ");
        // Call the type() method on the soda object to get the description
        soda.type();

        // Print "How much would you like to charge for the bottled soda?
        // (Input a numerical number taken to 2 decimal places)"
        System.out.println("How much would you like to charge for the bottled soda?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        // Set the String variable named priceText equal to input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        priceText = input.nextLine();

        // Set the double variable named price equal to Double.parseDouble(priceText)
        price = Double.parseDouble(priceText);

        // Now that we have the price, we can call the setPrice() method with the parameter of price on the soda object
        soda.setPrice(price);

        // Print "We are deciding on the price for our bottle of milk. Here is the description:"
        System.out.println("We are deciding on the price for our bottle of milk. Here is the description: ");
        // Call the type() method on the milk object to get the description
        milk.type();

        // Print "How much would you like to charge for the bottled milk?
        // (Input a numerical number taken to 2 decimal places)"
        System.out.println("How much would you like to charge for the bottled milk?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        // Set the String variable named priceText equal to input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        priceText = input.nextLine();

        // Set the double variable named price equal to Double.parseDouble(priceText)
        price = Double.parseDouble(priceText);

        // Now that we have the price, we can call the setPrice() method with the parameter of price on the milk object
        milk.setPrice(price);

        // add water to drinkMenu
        drinkMenu.add(water);

        // add soda to drinkMenu
        drinkMenu.add(soda);

        // add milk to drinkMenu
        drinkMenu.add(milk);
}
    }

class Cupcake{
        public double price;

        public double getPrice(){
            return price;
        }
        public void setPrice(double price){
            this.price = price;
        }

        public void type(){
            System.out.println("A basic, generic cupcake, with vanilla frosting");
        }

    }

    class RedVelvet extends Cupcake{
        public void type(){
            System.out.println("A red velvet based cupcake, with cream cheese frosting.");
        }
    }

class Choclate extends Cupcake{
    public void type(){
        System.out.println("A chocolate based cupcake, with chocolate frosting");
        }
}

class Drink{
    public double price;
    public double getPrice(){
    return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void type(){
        System.out.println("A bottle of water");
    }
}
class Soda extends Drink{
        public void type(){
            System.out.println("A bottle of soda");
     }
}

class Milk extends Drink{
    public void type(){
        System.out.println("A bottle of milk");
    }
}

