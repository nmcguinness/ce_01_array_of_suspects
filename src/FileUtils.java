import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileUtils {

    public static ArrayList<String> readCommaSeparatedFile(String filePath) throws IOException {
        // Read all lines and join into one string (in case file has line breaks)
        String content = String.join("", Files.readAllLines(Paths.get(filePath)));

        // Split by comma, trim whitespace, collect into ArrayList
        String[] parts = content.split(",");
        ArrayList<String> list = new ArrayList<>();
        for (String part : parts) {
            list.add(part.trim());
        }
        return list;
    }

    // Example usage
    public static void main(String[] args) {
        try {
            ArrayList<String> plates = readCommaSeparatedFile("plates_10k.txt");
            System.out.println("Read " + plates.size() + " entries.");
            System.out.println("First 5: " + plates.subList(0, Math.min(5, plates.size())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}