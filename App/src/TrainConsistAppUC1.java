import java.util.Arrays;

public class TrainConsistAppUC19 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        String searchKey = "BG412";

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(searchKey);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND using Binary Search.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }

        System.out.println("Program continues safely...");
    }
}