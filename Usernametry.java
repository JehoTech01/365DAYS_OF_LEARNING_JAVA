
import java.util.Scanner;



public class Usernametry {

  /*public static void informationManager() {
    String name = JOptionPane.showInputDialog("Enter your name: ");
    while (name == null || name.trim().isEmpty() || name.matches(".*\\d.*")) {
      if (name == null || name.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Name should not be empty. Please enter your name.");
      } else if (name.matches(".*\\d.*")) {
        JOptionPane.showMessageDialog(null, "Name should not contain numbers. Please enter a valid name.");
      }
      name = JOptionPane.showInputDialog("Enter your name: ");
    }

    String age = JOptionPane.showInputDialog("Enter your age: ");
    int old = 0;
    while (true){
      if (age == null || age.trim().isEmpty()){
        JOptionPane.showMessageDialog(null, "Age should not be empty. Please enter your age.");
        age = JOptionPane.showInputDialog("Enter your age: ");
      } else {
        try {
          old = Integer.parseInt(age);
          if (old < 15 || old > 60) {
            JOptionPane.showMessageDialog(null, "Invalid age! Please enter a valid age between 15 and 60.");
            age = JOptionPane.showInputDialog("Enter your age: ");
          } else {
            break;
          }
        } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(null, "Invalid age! Please enter a valid number.");
          age = JOptionPane.showInputDialog("Enter your age: ");
        }
      }
    }

    String username = JOptionPane.showInputDialog("Register your username: ");

    String pasString = JOptionPane.showInputDialog("Register your password: ");
  }*/
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numb1 = 5;

    System.out.print("Enter a number(1-5): ");
    int num1 = scanner.nextInt();

    switch (num1){
      case 1:
          System.out.println("It is Monday");
          break;
      case 2:
          System.out.println("It is Tuesday"); 
          break;
      case 3:
          System.out.println("It is Wednesday");
          break;
      case 4:
          System.out.println("It is Thursday");
          break;
      case 5:
          System.out.println("It is Friday");
          break;
          default:
          System.out.println("It is Weekend");
    }



    if (num1 == null || num1.trim || num1.isEmpty) {
      System.out.println("");
        
    } else {
    }



    scanner.close();
    
    

  }
}
