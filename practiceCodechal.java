import java.util.InputMismatchException;
import java.util.Scanner;

public class practiceCodechal {
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
//EASY
/*2️⃣ Add Two Numbers
ADD TWO NUMBERS
📌 Ask the user for two numbers and print their sum.
import java.util.Scanner;

public class practiceCodechal {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) { 
    System.out.println("Enter the First number: ");
    int num1 = scanner.nextInt();
    System.out.println("Enter the Second number: ");
    int num2 = scanner.nextInt();
    double result = num1 + num2;
    System.out.println(result);

  }
  }
}
 */
/*3️⃣ Find the Larger Number
📌 Ask the user for two numbers and print the larger one using if...else.
 import java.util.Scanner;
public class practiceCodechal {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) { 
        

    System.out.println("Enter the First number: ");
    int num1 = scanner.nextInt();
    System.out.println("Enter the Second number: ");
    int num2 = scanner.nextInt();

    if (num1 == num2) {
      System.out.println("The numbers are equal.");
    }
    else if (num1 > num2) {
      System.out.println("The largest number is: " + num1);
    } else {
      System.out.println("The largest number is: " + num2);
    }


  }
  
  }

}
 */
/*4️⃣ Even or Odd Checker
📌 Ask the user for a number and print whether it's even or odd.
import java.util.Scanner;
public class practiceCodechal {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) { 
    System.out.println("Enter the number: ");
    int num1 = scanner.nextInt();
    if (num1 % 2 == 0) {
      System.out.println("The number is even.");
    } else {
      System.out.println("The number is odd.");
    }
  
  }
  }
}
 */
/*5️⃣ Simple Calculator (Switch Case)
📌 Use switch to create a calculator that adds, subtracts, multiplies, or divides two numbers based on user input. 
import java.util.Scanner;
public class practiceCodechal {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {

    System.out.println("Enter the First number: ");
    int num1 = scanner.nextInt();

    System.out.println("Enter the Second number: ");
    int num2 = scanner.nextInt();

    System.out.println("Choose Operation (+, -, *, /)");
    char operation = scanner.next().charAt(0);

    switch (operation) {
        case '+':
            System.out.println("The Result is: "+ (num1 + num2));
            break;
        case '-':
            System.out.println("The Result is: "+ (num1 - num2));
            break;
        case '*':
            System.out.println("The Result is: "+ (num1 * num2));
            break;
        case '/':
            System.out.println("The Result is: "+ (num1 / num2));
            break;
        default:
            System.out.println("Invalid Input!!!!!!!!!!!!!!!!!");

    }
  }
}
}
 */

//NORMAL

/*6️⃣ Find the Greatest of Three Numbers
📌 Ask the user for three numbers and determine the largest.

import java.util.Scanner;
public class practiceCodechal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter three numbers: ");

    int num1 = scanner.nextInt(); // Read the first number
    int num2 = scanner.nextInt(); // Read the second number
    int num3 = scanner.nextInt(); // Read the third number
    //📌 Ask the user for three numbers and determine the largest.
    if (num1 > num2 || num1 > num2 ) {
      System.out.println("The Largest number is: " + num1);
    } else if(num2 > num3 || num2 > num3){
      System.out.println("The Largest number is: " + num2);
    }else if(num3 > num2 || num3 > num2){
      System.out.println("The Largest number is: " + num3);
    }else if(num1 == num2 || num2 == num3 || num1 == num3) {
      System.out.println("The Numbers are Equal");
    }else{
      System.out.println("Invalid Input!!!");
    }


}
}
 */
/*7️⃣ Convert Fahrenheit to Celsius
📌 Ask the user for a temperature in Fahrenheit and convert it to Celsius.
*/
/*8️⃣ Reverse a String
import java.util.Scanner; 
public class practiceCodechal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Enter a Word: ");
    String jeho1 = scanner.nextLine();
    String jeho2 = "";
    for (int i = 0;i < jeho1.length(); i++) { 
      jeho2 = jeho1.charAt(i) + jeho2;
     }
     System.out.println(jeho2);

     /*System.out.print("\nDo you want to enter another information again? (yes/no): ");
     String response = scanner.nextLine().trim().toLowerCase();
     if (response.equals("yes")) {
          return;
     } else if (response.equals("no")) {
         System.out.println("Goodbye!");
     } else {
         System.out.println("Invalid Input Babyeeeeeeeeeeeeeeeeeeeee!!!!!!!!!!!!!!!!!!");

     }

     scanner.close();
}
}*/
/*9️⃣ Simple Login System
 import java.util.Scanner;
public class practiceCodechal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String userAdmin = "admin";
    String passAdmin = "1234";



    System.out.println("Enter your Username: ");
    String username1 = scanner.nextLine();

    System.out.println("Enter your Password: ");
    String passwrod2 = scanner.nextLine();

    if (true) {
      if (username1.equals(userAdmin) && passwrod2.equals(passAdmin)) {
        System.out.println("Welcome Admin!");
      } else {
        System.out.println("Invalid Username or Password!");
      }

    scanner.close();

}
  }
}
 */
/*🔟 Multiplication Table (For Loop)
 import java.util.Scanner;
public class practiceCodechal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num1 = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(num1 + " x " + i + " = " + num1 * i);
    }

  }
  }

 */


//HARD
 /*1️⃣1️⃣ Count Vowels in a String
 import java.util.Scanner;
public class practiceCodechal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String alphabets = "abcdefghijklmnopqrstuvwxyz";


    System.out.println("Enter a String: ");
    String string1 = scanner.next();

    int vowels = 1;


    for (int i = 0; i < string1.length(); i++) {
      char ch = string1.charAt(i);
      if (alphabets.contains(String.valueOf(ch))) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
          vowels++;
        }else {
          continue;
        }
      }
    }

    System.out.println("The number of vowels is: " + vowels);

  }
  }
 */
/*1️⃣2️⃣ Check if a Number is Prime
 import java.util.Scanner;
public class practiceCodechal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean isPrime = true;

    System.out.println("Enter a number: ");
    int num1 = scanner.nextInt();

    if (num1 <= 1) {
      isPrime = false;
      System.out.println("The number is not a prime number.");
    } else {
      System.out.println("The number is a prime number.");
        }
        for (int i = 2; i <= Math.sqrt(num1); i++) {
          if (num1 % i == 0) {
            isPrime = false;
            break;
      }
      
    }
    if (isPrime) {
      System.out.println(num1 + " is a prime number.");
  } else {
      System.out.println(num1 + " is not a prime number.");
  }

  }
}
 */

//DIFFICULT
/*1️⃣7️⃣ Rock, Paper, Scissors Game
 RECREATE in 2nd YEAR
 import java.util.Scanner;
public class practiceCodechal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

  String[] choice = {"Rock", "Paper", "Scissors"};
  System.out.println("Welcome to Rock, Paper, Scissors Game!");
  System.out.println("Choose: Rock, Paper, Scissors");

  String userChoice = scanner.nextLine();
  int random = (int) (Math.random() * choice.length);
  String computerChoice = choice[random];

  System.out.println("Computer Choice: " + computerChoice);

  if (userChoice.equals(computerChoice)) {
    System.out.println("It's a Tie!");
  } else if (userChoice.equals("Rock") && computerChoice.equals("Scissors") || userChoice.equals("Paper") && computerChoice.equals("Rock") || userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
    System.out.println("You Win!");
  } else {
    System.out.println("You Lose!");
  }
}
}

 */
/*1️⃣8️⃣ Number Guessing Game
 import java.util.Random;
import java.util.Scanner;
public class practiceCodechal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Random random = new Random();
    int attemps = 3;
    int number = random.nextInt(50);

    while (attemps > 0) { 
      System.out.println("Guess the Number: ");
      int guess = scanner.nextInt();
    if (guess == number) {
      System.out.println("You Guessed the Correct Number!");
      break;
    } else if (guess > number) {
      System.out.println("The number is too high.");
    } else {
      System.out.println("The number is too low. ");
    }
    attemps--;
  }
  if (attemps == 0) {
    System.out.println("You have no more attemps left!"  + "The number was: " + number);
  }
}
}
 */
/*1️⃣9️⃣ Convert Decimal to Binary
 import java.util.Scanner;
public class practiceCodechal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a number: ");
while (true) { 
    

    try {
      int num1 = scanner.nextInt();
      if (num1 < 1 || num1 > 99999) {
        System.out.println("Invalid number! Please enter a number between 1 and 99,999.");
      }else {
        // Convert to binary
        String binary = Integer.toBinaryString(num1);
        System.out.println("Binary of " + num1 + " is: " + binary);
      }
    } catch (Exception e) {
      System.out.println("Invalid Input! Please enter a valid number.");
      scanner.next(); // Clear the invalid input

    }

  }
}
}
 */
 /*2️⃣0 ATM Machine Concept

 import java.util.InputMismatchException;
import java.util.Scanner;

public class practiceCodechal {
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
*/