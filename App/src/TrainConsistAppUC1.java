public class TrainConsistAppUC18 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        String searchKey = "BG309";

        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the train consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND in the train consist.");
        }

        System.out.println("Program continues safely...");
    }
}