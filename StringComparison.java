// File name: StringOperations.java

public class StringComparison {
    public static void main(String[] 
    args) {
        // Step 1: Compare two strings
        String str1 = "HelloWorld";
        String str2 = "helloworld";

        System.out.println("Comparing two strings:");
        if (str1.equals(str2)) {
            System.out.println("Strings are exactly equal.");
        } else if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal (ignoring case).");
        } else {
            System.out.println("Strings are not equal.");
        }

        // Step 2: Search for a substring in a string
        String mainString = "Welcome to Advanced Java Programming!";
        String searchString = "Java";

        System.out.println("\nSearching for substring:");
        if (mainString.contains(searchString)) {
            System.out.println("\"" + searchString + "\" found in the main string.");
        } else {
            System.out.println("\"" + searchString + "\" not found in the main string.");
        }
    }
}
