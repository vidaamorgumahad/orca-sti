import java.util.Scanner;

public class DemoParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of guests for the dinner party: ");
        int numGuests = scanner.nextInt();

        System.out.print("Enter the menu option (1 for chicken or 2 for beef): ");
        int foodChoice = scanner.nextInt();

        DinnerParty dinnerParty = new DinnerParty();
        dinnerParty.setNumGuests(numGuests);
        dinnerParty.setFoodChoice(foodChoice);

        System.out.println("The dinner party has " + dinnerParty.getNumGuests() + " guests.");
        
        if (dinnerParty.getFoodChoice() == 1) {
            System.out.println("Menu option 1 will be served.");
        } else if (dinnerParty.getFoodChoice() == 2) {
            System.out.println("Menu option 2 will be served.");
        }

        dinnerParty.showInvitation();
    }
}
