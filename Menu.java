package MenuJeho;


import javax.swing.JOptionPane;

public class Menu {

  //Main Function is here
  public static void jehoMenu(){
    while (true) { 
        

    String [] menu = {"AverageGrade1", "GcashConcept.jar", "StudInfoSW1.jar "}; 
      for (int i = 0; i < menu.length; i++) {
        menu[i] = (i + 1) + ". " + menu[i];
      }
      String options = JOptionPane.showInputDialog(menu, "Select an option (1-3): ");

    if (options == null) {
      JOptionPane.showMessageDialog(null, "No option selected. Exiting.", "Error", JOptionPane.ERROR_MESSAGE);
      return;
    }

    int choice;
    try {
      choice = Integer.parseInt(options);
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
      continue; // Ask again123

    }

    switch (choice) {
      case 1:
      runJar("C:/Users/Jeho/Documents/2ndSem/AverageGrade1.jar");
          break;

      case 2:
      runJar("C:\\Users\\Jeho\\Documents\\2ndSem\\MenuJeho\\GcashConcept.jar");
          break;

      case 3:
      runJar("C:/Users/Jeho/Documents/2ndSem/StudInfoSW1.jar");
          break;

      case 0:
          System.out.println("Goodbye!");
          
          break;

      default:
          System.out.println("Invalid choice. Please try again.");
  }

    int continueChoice = JOptionPane.showConfirmDialog(null, "Do you want to use another program?", "Continue", JOptionPane.YES_NO_OPTION);
    if (continueChoice != JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "Goodbye!", "Exit", JOptionPane.INFORMATION_MESSAGE);
        break;
    }
}

  }


  public static void runJar(String jarName) {
    try {
        ProcessBuilder pb = new ProcessBuilder("java", "-jar", jarName);
        pb.inheritIO(); // To show output in terminal
        Process process = pb.start();
        process.waitFor();//The use of this is to delay the "continueChoice" or the while loop on the method "jehoMenu" for 1 second to process the jar file
        System.out.println("Finished running " + jarName);
    } catch (Exception e) {
        System.out.println("Failed to run " + jarName);
        e.printStackTrace();
    }
}
  public static void main(String[] args) {

    jehoMenu();

  }
  
}
