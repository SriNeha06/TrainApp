import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistAppUC5 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");

        System.out.println("Final Train Formation: " + formation);
    }
}