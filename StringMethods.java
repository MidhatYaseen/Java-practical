
public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Advanced Java Programming";
        String str2 = "java";
         System.out.println("Length: " + str1.length());

        // 2. Convert to Upper and Lower Case
        System.out.println("Upper Case: " + str1.toUpperCase());
        System.out.println("Lower Case: " + str1.toLowerCase());
// 3. Check if str1 contains "Java"
        System.out.println("Contains 'Java'? " + str1.contains("Java"));

        // 4. Starts With and Ends With
        System.out.println("Starts with 'Advanced'? " + str1.startsWith("Advanced"));
        System.out.println("Ends with 'ing'? " + str1.endsWith("ing"));

        // 5. Index of substring
        System.out.println("Index of 'Java': " + str1.indexOf("Java"));
        // 6. Character at index
        System.out.println("Character at index 5: " + str1.charAt(5));

        // 7. Replace text
        System.out.println("Replace 'Java' with 'Python': " + str1.replace("Java", "Python"));

        // 8. Substring
        System.out.println("Substring (9 to 13): " + str1.substring(9, 13));

        // 9. Equality check (case-sensitive and case-insensitive)
        System.out.println("Equals to str2? " + str1.equals(str2));
        System.out.println("Equals Ignore Case? " + str1.equalsIgnoreCase(str2));
// 10. Trim whitespace
        String str3 = "   Hello Java!   ";
        System.out.println("Before trim: '" + str3 + "'");
        System.out.println("After trim: '" + str3.trim() + "'");
    }
}
