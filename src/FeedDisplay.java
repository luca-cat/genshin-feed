import java.util.List;
import java.util.Scanner;

public class FeedDisplay {

    private List<Leak> leaks;
    private Scanner sc;

    FeedDisplay(List<Leak> leaks, Scanner sc){
        this.leaks = leaks;
        this.sc = sc;
    }

    public void displayMenu(){
        System.out.println("Genshin Feed");
        System.out.println("+----------+");
        System.out.println("1. Display Leaks\n2. Favourite Leaks\n3. Quit");
        System.out.print("Selection: ");
    }

    public List<Leak> getLeaks(){
        return leaks;
    }

    public int getLimitOfLeaks(){
        System.out.println("How many leaks would you like to show? (MAX 5)");

        while (true){
            int leakQuantity = Integer.valueOf(sc.nextLine());

            if (leakQuantity <= 0 || leakQuantity > 5){
                System.out.println("invalid option");
                continue;
            } 

            return leakQuantity;
        }

    }

    public void registerFavourite(){
        
        System.out.println("Will you favourite?");

        while (true){
            String selection = sc.nextLine();
            selection = selection.toLowerCase();
            if (selection.equals("y") || selection.equals("yes")){
                System.out.println("Which one?");
                return;
            } else {
                System.out.println("Understood...");
                return;
            }
        }
    }

}
