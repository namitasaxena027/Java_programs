
public class Mars {
    public static void main(String[] args) {
        String colonyName = "colonymars";
        int shipPopulation = 300;
        Double meals = 4000.00;
        Boolean landing = true;

        Double perDayMeal = 0.75;
        int days = 2;
        int extraCrate = 1;
        int shipPopulationIncrease = 5;

        Double usedMeals = shipPopulation*perDayMeal*days;
        meals = meals - usedMeals;
        System.out.println("Number of meals left: "+ meals + " after " + days + " days."); //Print the number of meals that are left

        meals += 0.5 * extraCrate;

        shipPopulation += shipPopulationIncrease;

        String landingLocation = "The Plain";
        if (landingLocation.equalsIgnoreCase("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        }else{
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        landingCheck(9);
        
        new GuessingGame();
        new MarsExpedition();
    }

    public static Boolean landingCheck (int minutesLeft){
        for (int minute = 0; minute <= minutesLeft; minute++){
            if ((minute % 3 == 0) && (minute % 2 == 0)){
                System.out.println("Keep Center");
            }else if (minute % 3 == 0){
                System.out.println("Left");
            }else if (minute % 2 == 0){
                System.out.println("Right");
            }else{
                System.out.println("Calculating");
            }

            try {
            Thread.sleep(250);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Landed");
        return false;
    }
}
