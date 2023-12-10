import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class SimulatedDataSet {

    public static void main(String[] args) {
        // Number of instances in the data set
        int numInstances = 100;

        // Set to store unique instances
        Set<String> dataSet = new HashSet<>();

        // Generate unique instances
        for (int i = 0; i < numInstances; i++) {
            String instance = generateRandomInstance();
            
            // Ensure uniqueness
            while (!dataSet.add(instance)) {
                // If the instance is not unique, generate a new one
                instance = generateRandomInstance();
            }
        }

        // Print the simulated data set
        for (String instance : dataSet) {
            System.out.println(instance);
        }
    }

    // Function to generate random data for each instance
    private static String generateRandomInstance() {
        // Modify this function based on the type of data you want to generate
        // For simplicity, let's generate a random string of 10 characters
        StringBuilder randomData = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char randomChar = (char) ('a' + random.nextInt(26));
            randomData.append(randomChar);
        }
        return randomData.toString();
    }
}