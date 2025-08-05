// Importing required libraries (even if java.lang is auto imported)
public class StringOperations {
    public static void main(String[] args) {

        // 1. String literal
        String str1 = "Hello";

        // 2. Using new keyword
        String str2 = new String("World");

        // 3. Character array
        char[] charArray = { 'J', 'a', 'v', 'a' };
        String str3 = new String(charArray);

        // 4. StringBuilder to String
        StringBuilder sb = new StringBuilder("Programming");
        String str4 = sb.toString();

        // --- Performing Various Operations ---

        System.out.println("Original Strings:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);

        // Length
        System.out.println("\nLength of str4: " + str4.length());

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenated str1 and str2: " + result);

        // Uppercase and Lowercase
        System.out.println("str3 in uppercase: " + str3.toUpperCase());
        System.out.println("str3 in lowercase: " + str3.toLowerCase());

        // charAt and indexOf
        System.out.println("Character at index 2 in str4: " + str4.charAt(2));
        System.out.println("Index of 'a' in str3: " + str3.indexOf('a'));

        // Substring
        System.out.println("Substring of str4 from 3 to 8: " + str4.substring(3, 8));

        // Replace
        System.out.println("Replace 'a' with '@' in str3: " + str3.replace('a', '@'));

        // Check equals and equalsIgnoreCase
        System.out.println("str1 equals 'Hello': " + str1.equals("Hello"));
        System.out.println("str1 equalsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello"));

        // Trim (with extra space)
        String str5 = "   Trim me!   ";
        System.out.println("Before trim: '" + str5 + "'");
        System.out.println("After trim: '" + str5.trim() + "'");
    }
}

