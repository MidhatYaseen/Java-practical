import java.io.*;

public class FileCreate {
    public static void main(String[] args) {
        // Step 1: Create directory
        File folder = new File("MyFolder");
        folder.mkdir();  // makes directory

        // Step 2: Create file inside directory
        File file = new File("MyFolder/myfile.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
