import java.util.InputMismatchException;
import java.util.Scanner;

public class AtmMachine {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int pin = 41506;
    
    double balance = 0;
    boolean isRunning = true; // Controls the main loop
    System.out.println("Welcome to the ATM! ");
 
    while (true) {
      try {
          System.out.print("Enter your Pin: ");
          int userPin = scanner.nextInt();
          if (userPin != pin) {
              System.out.println("Invalid Pin! Please try again.");
          } else {
              System.out.println("PIN accepted. Access granted!");
              scanner.nextLine();
              break; // Exit the loop if the PIN is correct
          }
      } catch (InputMismatchException e) {
          System.out.println("Invalid input! Please enter a valid number.");
          scanner.next(); // Clear the invalid input
      }
  }
  
  //Main ATM functions
  while (isRunning) {
    System.out.println("Choose an option: ");
    System.out.println("1. Check Balance");
    System.out.println("2. Deposit Money");
    System.out.println("3. Withdraw Money");
    System.out.println("4. Exit");
    int atmFunctions = scanner.nextInt();
    switch (atmFunctions) {
        case 1:
            System.out.println("Check Balance");
            System.out.println("Your balance is: " + balance);
            break;
        case 2:
            System.out.println("Deposit Money");
            System.out.println("Enter the amount to deposit: ");
            double deposit = scanner.nextDouble();
            balance += deposit;
            System.out.println("Your new balance is: " + balance);
            break;
        case 3:
            System.out.println("Withdraw Money");
            System.out.println("Enter the amount to withdraw: ");
            double withdraw = scanner.nextDouble();
            if (withdraw > balance) {
                System.out.println("Insufficient funds!");
            } else {
                balance -= withdraw;
                System.out.println("Your new balance is: " + balance);
            }
            break;
        case 4:
            System.out.println("Thank you for using the ATM!");
            System.exit(0);

            break;
        default:
            System.out.println("Invalid Input!");
  }
  if (isRunning) {
    System.out.print("Do you want to perform another transaction? (1(Yes)/2(No)): ");
    String response = scanner.next().trim().toLowerCase();
    if (response.equals("2")) {
        System.out.println("Thank you for using the ATM!");
        isRunning = false; // Exit the loop
    } else if (!response.equals("1")) {
        System.out.println("Invalid input! Exiting...");
        isRunning = false; // Exit the loop
    }

}
}
}
}