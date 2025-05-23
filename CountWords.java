import java.util.Scanner;
public class CountWords {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string:");
    String input = scanner.nextLine();

    int wordCount = input.split("\\s").length;
    System.out.print("Number of Words: "+ wordCount);

    /* 
    //JOption Method
    String input2 = JOptionPane.showInputDialog(null, "Enter a string:");

    int wordCount2 = input2.split("\\s").length;
    JOptionPane.showMessageDialog(null, "Number of Words: " + wordCount2);
    */



  }
}
