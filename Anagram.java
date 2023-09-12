import java.util.*;

public class import java.util.*;

public class Main {
  public static void main(String args[]) {
    // Initialize two strings
    String str1 = "race";
    String str2 = "care";
   
    // Convert both strings to lowercase to handle case-insensitivity
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // Check if the lengths of the strings are equal
    if (str1.length() == str2.length()) {
      // Convert the strings to character arrays
      char[] str1charArray = str1.toCharArray();
      char[] str2charArray = str2.toCharArray();

      // Sort the character arrays
      Arrays.sort(str1charArray);
      Arrays.sort(str2charArray);

      // Check if the sorted arrays are equal (if they are, it means the strings are anagrams)
      Boolean result = Arrays.equals(str1charArray, str2charArray);

      if (result) {
        System.out.println("is a anagram");
      } else {
        System.out.println("is not a anagram");
      }
    } else {
      System.out.println("it is not a anagram");
    }
  }
}
 {
  public static void main(String args[]) {
    // Initialize two strings
    String str1 = "race";
    String str2 = "care";
   
    // Convert both strings to lowercase to handle case-insensitivity
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // Check if the lengths of the strings are equal
    if (str1.length() == str2.length()) {
      // Convert the strings to character arrays
      char[] str1charArray = str1.toCharArray();
      char[] str2charArray = str2.toCharArray();

      // Sort the character arrays
      Arrays.sort(str1charArray);
      Arrays.sort(str2charArray);

      // Check if the sorted arrays are equal (if they are, it means the strings are anagrams)
      Boolean result = Arrays.equals(str1charArray, str2charArray);

      if (result) {
        System.out.println("is a anagram");
      } else {
        System.out.println("is not a anagram");
      }
    } else {
      System.out.println("it is not a anagram");
    }
  }
}
