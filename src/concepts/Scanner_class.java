package concepts;
import java.io.File; // To handle file operations
import java.io.FileNotFoundException; // To handle file errors
import java.util.Scanner; // For reading input

public class Scanner_class {
    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/Lavi/IdeaProjects/gittest/src/concepts/input_java.txt ");


            // Step 2: Create a Scanner object to read from the file
            Scanner sc = new Scanner(file);

            // Step 3: Read file line by line
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println("Read line: " + line);
            }

            // Step 4: Close the Scanner
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found! Please check the file path.");
            e.printStackTrace();

        }
    }
}
