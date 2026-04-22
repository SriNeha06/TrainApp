import java.util.Arrays;

public class TrainConsistAppUC17 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        Arrays.sort(bogieNames);

        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("Program continues safely...");
    }
}