//Anagramchecker
import java.util.Scanner;

public class AnagramChecker {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first string: ");
    String str1 = scanner.nextLine();


    System.out.print("Enter second string: ");
    String str2 = scanner.nextLine();


    if (str1.length() != str2.length()) {
      System.out.println("The strings are not anagrams.");
    } else {
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      java.util.Arrays.sort(charArray1);
      java.util.Arrays.sort(charArray2);

      if (java.util.Arrays.equals(charArray1, charArray2)) {
        System.out.println("The strings are anagrams.");
      } else {
        System.out.println("The strings are not anagrams.");
      }
    }
    scanner.close();

  }
}