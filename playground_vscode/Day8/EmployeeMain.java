import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {


    static ArrayList<String> actorNames = new ArrayList<>();
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }


        actorNames.add("Tom Cruise");
        actorNames.add("Chris Hemsworth");
        actorNames.add("Robert Downey Jr.");
        actorNames.add("Chris Evans");
        actorNames.add("Tom Cruise");

        for(String actor: actorNames) {
            System.out.println(actor);
        }
        
    }

}
    

    
    

    
    
        
    }
