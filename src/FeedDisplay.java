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
        System.out.println("How many leaks would you like to show?");

        while (true){
            int leakQuantity = Integer.valueOf(sc.nextLine());

            if (leakQuantity <= 0){
                System.out.println("invalid option");
                continue;
            } 

            return leakQuantity;
        }

    }

}
