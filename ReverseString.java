import java.util.Scanner;
public class ReverseString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a String: ");
    String string1 = scanner.nextLine();

    String blank = "";

    for (int i = 0; i < string1.length(); i++) {

      blank = string1.charAt(i) + blank;
      
    }
    System.out.println("The Reverse String of '" + string1 + "' is\n" + blank);
  }
}
