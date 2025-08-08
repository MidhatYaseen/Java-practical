import java.io.*;

public class SimpleFileHandling {
    public static void main(String[] args) {
        try {
            // Step 1: Create & write to file
            FileWriter writer = new FileWriter("demo.txt");
            writer.write("This is a file handling example.");
            writer.close();
            System.out.println("File written successfully.");

            // Step 2: Read from file
            FileReader reader = new FileReader("demo.txt");
            int ch;
            System.out.print("File content: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
