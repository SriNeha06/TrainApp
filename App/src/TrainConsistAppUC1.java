import java.util.ArrayList;
import java.util.List;

public class TrainConsistAppUC20 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> bogieIds = new ArrayList<>();

        String searchKey = "BG101";

        try {
            if (bogieIds.isEmpty()) {
                throw new IllegalStateException("Cannot perform search: Train consist is empty");
            }

            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchKey)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Bogie ID " + searchKey + " FOUND.");
            } else {
                System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}