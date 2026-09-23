import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Leak> leaks = new ArrayList<>();

        FeedDisplay feed = new FeedDisplay(leaks, sc);

        Leak testLeak = new Leak("Columbina gets a buff", null, "Pietro", null, "7.6");
        leaks.add(testLeak);
        Leak testLeak2 = new Leak("New Xiao Skin", null, "Pietro", null, "7.3");
        leaks.add(testLeak2);

        while (true){
            feed.displayMenu();
            String selection = sc.nextLine();
            
            if (selection.equals("3")){
                return;
            }

            if (selection.equals("1")){
                
                int limit = feed.getLimitOfLeaks();

                System.out.println();

                for (int i = 0; i < limit; i++){
                    if (feed.getLeaks().size() < limit){
                        System.out.println(feed.getLeaks().get(i) + "\n");
                    } else {
                        System.out.println("Leak unavailable");
                    }
                }

                //prints out each leak in the leak list

                System.out.println();
                continue;

            } else if (selection.equals("2")){
                System.out.println("Shows favourites");
                continue;
            } else {
                System.out.println();
                continue;

            }
        }
    }
}
