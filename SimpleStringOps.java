

public class SimpleStringOps {
    public static void main(String[] args) {
        String str = "Java Programming";

        // Concatenation
        String newStr = str + " Language";
        System.out.println("Concatenated: " + newStr);

        // Replace "Java" with "Advanced Java"
        String replaced = str.replace("Java", "Advanced Java");
        System.out.println("Replaced: " + replaced);

        // Substring from index 5 to 16
        String sub = str.substring(5, 16);
        System.out.println("Substring: " + sub);

        // Convert to upper case
        String upper = str.toUpperCase();
        System.out.println("Upper Case: " + upper);
    }
}
 
    

