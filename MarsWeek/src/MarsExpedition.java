import java.util.Scanner;


public class MarsExpedition {
    public MarsExpedition(){
        Scanner input = new Scanner(System.in);

        System.out.println("Starting Expedition prep program");
        System.out.println("...");
        System.out.println("Ready");
        try {
            Thread.sleep(250);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        
        System.out.println("What is your name?");
        String name =input.nextLine();

        System.out.println("Hi, "+ name+ " — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String option = input.nextLine();

        if (option.equals("Y")){
            System.out.println("I knew you would say that. You are team leader for a reason.");
        }else{
            System.out.println("Too bad you are team leader. You have to go");
        }

    System.out.println("How many people you want in the team");
    Integer membersTeam = input.nextInt();
    input.nextLine();

    if (membersTeam> 2){
        System.out.println("That’s way to many people. We can only send 2 more members.");
        membersTeam = 2;
    }else if (membersTeam < 2) {
        System.out.println("That's not enough people. We need you and 2 more members.");
        membersTeam = 2;
    } else if (membersTeam== 2) {
        System.out.println("That's a perfect sized team. Good job.");
    }

    System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
    String snack = input.nextLine();

    System.out.println("Nice choice, you will be bringing a " + snack +" with you.");

    System.out.println("You have the choice of 3 vehicles" +
        "\nA: A Mars Rover" +
        "\nB: A Chevy Silverado" +
        "\nC: A Honda Civic");
    String vehicleChoice = input.nextLine();

    if (vehicleChoice.equalsIgnoreCase("A")) {
    vehicleChoice = "a Mars Rover";
    } else if (vehicleChoice.equalsIgnoreCase("B")) {
    vehicleChoice = "a Chevy Silverado";
    } else if (vehicleChoice.equalsIgnoreCase("C")) {
    vehicleChoice = "a Honda Civic";
    } else {
    vehicleChoice = "your feet";
    }

    // String vehicle;

    // switch (vehicleChoice){
    //     case 'A': vehicle = "a Mars Rover"; break;
    //     case 'B': vehicle = "a Chevy Silverado"; break;
    //     case 'C': vehicle = "a Honda Civic"; break;
    //     default:  vehicle = "your feet";
    // }

    System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + membersTeam + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");





    }
}
