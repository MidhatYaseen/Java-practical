import java.io.*;

public class CharStreamExample {
    public static void main(String[] args) {
        try {
            // Write text to file using character stream
            FileWriter writer = new FileWriter("demo.txt");
            writer.write("Hello Java");
            writer.close();
            System.out.println("Text written to file.");

            // Read text from file using character stream
            FileReader reader = new FileReader("demo.txt");
            int ch;
            System.out.print("Reading from file: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
