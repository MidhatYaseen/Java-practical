// Importing necessary library (optional here, but for advanced java format)

public class CharacterExtraction {
    public static void main(String[] args) {

        // Original String
        String text = "AdvancedJava";

        // Display original string
        System.out.println("Original String: " + text);

        // 1. Extract single character using charAt()
        char ch1 = text.charAt(0);  // First character
        char ch2 = text.charAt(5);  // 6th character (index 5)
        char chLast = text.charAt(text.length() - 1); // Last character

        // 2. Extract a range of characters using substring()
        String sub1 = text.substring(0, 7); // from index 0 to 6 (7 not included)
        String sub2 = text.substring(5);    // from index 5 to end

        // Print extracted characters
        System.out.println("\nCharacter at index 0: " + ch1);
        System.out.println("Character at index 5: " + ch2);
        System.out.println("Last character: " + chLast);

        // Print extracted substrings
        System.out.println("\nSubstring from index 0 to 6: " + sub1);
        System.out.println("Substring from index 5 to end: " + sub2);
    }
}
