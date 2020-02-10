import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileIO {
    public static void main(String[] args) {
        newFile();
        readWriteFile();
    }

    static void newFile() {
        // CREATING A NEW DIRECTORY

        // Creating directory/file names as strings
        String directory = "data";
        String filename = "info.txt";

        // Setting path for directory
        Path dataDirectory = Paths.get(directory);
        // Printing absolute path for directory
        System.out.println(dataDirectory.toAbsolutePath());
        // Setting path for file (NOTE: method override in Paths class allows different parameters for files and directory creation)
        Path dataFile = Paths.get(directory, filename);

        // Error handling for file creation
        try {
            // NOTE: If the file already exists, program will run without creating files and WILL NOT run catch block
            // If the directory does not exist, create a new one
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
                System.out.println("Directory created");
            }
            // If file does not exist in the specified directory, create a new one
            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
                System.out.println("File created");
            }
            // Handling errors during file creation
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("Something went wrong");
        }
    }

    static void readWriteFile() {
        // Creating empty list
        List<String> fruit = null;
        try {
            // Getting grocery file path
            Path groceries = Paths.get("data", "groceries.txt");
            // Getting all lines from groceries.txt (which should be nothing at first)
            fruit = Files.readAllLines(groceries);
            // Print each line of the array to the console
            for (String line : fruit) {
                System.out.println(line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        // Adding items to empty fruit list
        fruit.add("kiwi");
        fruit.add("starfruit");
        try {
            // Getting groceries file
            Path groceries = Paths.get("data", "groceries.txt");
            // Writing new added contents to the file
            Files.write(groceries, fruit);
            System.out.println("Done");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }


}
