import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class SW2option {

//THIS PART IS FOR THE RECEIPT AND THIS PART WAS CALLED IN LINE 156 IN THE PRIVATE jehotianRandomString
public static void jehoReceipt(String name, int validAmount, int otp, String jcode) {
    SimpleDateFormat formatter = new SimpleDateFormat("MM -dd -yyyy HH:mm:ss");
    String dateTime = formatter.format(new Date());

    String receipt = "==============================\n"
                   + "         TRANSACTION RECEIPT         \n"
                   + "==============================\n"
                   + "Date & Time: " + dateTime + "\n"
                   + "Recipient: " + name + "\n"
                   + "Amount Received: PHP " + validAmount + "\n"
                   + "OTP: " + otp + "\n"
                   + "Transaction Code: " + jcode + "\n"
                   + "==============================\n"
                   + "     Thank you for using our service!     \n"
                   + "==============================";

    JOptionPane.showMessageDialog(null, receipt, "Transaction Receipt", JOptionPane.INFORMATION_MESSAGE);
}

//THIS PART IS FOR THE SENDER
    public static void JehoTian() {

        // IT SHOULD BE REQUIRED ALL INPUT
        String name = JOptionPane.showInputDialog("Enter your name: ");

        // Keep asking until the user enters a valid name (letters only, no numbers)
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
        while (true) {
            if (age == null || age.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Age should not be empty. Please enter your age.");
                age = JOptionPane.showInputDialog("Enter your age: ");
            } else {
                try {
                    old = Integer.parseInt(age);
                    if (old < 15 || old > 60) {
                        JOptionPane.showMessageDialog(null, "Invalid age! Please enter a valid age between 15 and 60.");
                        age = JOptionPane.showInputDialog("Enter your age: ");
                    } else {
                        break; // Exit the loop if age is valid
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid age! Please enter a valid number.");
                    age = JOptionPane.showInputDialog("Enter your age: ");
                }
            }
        }

        String address = JOptionPane.showInputDialog("Enter your address: ");
        while (address == null || address.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Addres should not be empty. Please enter your address.");
            address = JOptionPane.showInputDialog("Enter your address: ");
        }

        //Restriction: must be exactly 11 digits
        String contactNumber = JOptionPane.showInputDialog("Enter your contact number: ");
        while (contactNumber == null || contactNumber.length() != 11 || !contactNumber.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Invalid contact number! Please enter exactly 11 digits.");
            contactNumber = JOptionPane.showInputDialog("Enter your contact number: ");
        }

        // Display the collected information
        JOptionPane.showMessageDialog(null, "Name: " + name.toUpperCase() + "\nAge: " + old + "\nAddress: " + address.toUpperCase() + "\nContact Number: " + contactNumber);

        // Display the note
        JOptionPane.showMessageDialog(null, "NOTE: BELOW 1000 IS AUTOMATICALLY EQUIVALENT TO 1000 AND ABOVE 100000 IS ONLY 100000");

        // Call the method to handle OTP and Transaction Code
        JehoTiann();
    }

    public static int tianJeho() {
        while (true) {
            String amountInput = JOptionPane.showInputDialog("Enter the Amount (between 1000 and 100000): ");

            // Check if the input is null or empty
            if (amountInput == null || amountInput.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number.");
                continue; // Ask again
            }

            try {
                int amount = Integer.parseInt(amountInput);
                amount = Math.max(1000, Math.min(amount, 100000));

                if (amount >= 1000 && amount <= 100000) {
                    return amount;
                } else {
                    JOptionPane.showMessageDialog(null, "Amount must be between 1000 and 100000.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.");
            }
        }
    }

    // Method to display the OTP in a dialog box
    public static int jehoTianrandom() {
        int min = 1000;
        int max = 9999;
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    // Method to generate a random transaction code
    private static String tianJehoorandom() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>?";
        int length = 6; // Fixed length of 6
        return jehotianRandomString(characters, length);
    }

    // Method generate a random string
    private static String jehotianRandomString(String characters, int length) {
        StringBuilder result = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            result.append(characters.charAt(index));
        }
        return result.toString();
    }

    // Method to display the OTP and Transaction Code
    public static void JehoTiann() {
        int otp = jehoTianrandom(); // Generate the OTP
        String jcode = tianJehoorandom(); // Generate the Transaction Code
        int validAmount = tianJeho();

        JOptionPane.showMessageDialog(null, "The OTP is: " + otp);
        JOptionPane.showMessageDialog(null, "The Transaction Code is: " + jcode);

        JOptionPane.showMessageDialog(null, "Please remember or write down the OTP and Transaction Code.");
        String otp1 = JOptionPane.showInputDialog("Enter the OTP: ");
        String transaction = JOptionPane.showInputDialog("Enter the Transaction Code: ");
        int attempts = 0;
        while (attempts < 3) {
            if (otp1 == null || transaction == null || otp1.isEmpty() || transaction.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter OTP and Transaction Code!");
            } else if (otp1.equals(String.valueOf(otp)) && transaction.equals(jcode)) {
                JOptionPane.showMessageDialog(null, "OTP and Transaction Code are correct!" + "\nYou've Received: " + validAmount);

                jehoReceipt("Customer", validAmount, otp, jcode);//CALL THE METHOD RECEIPT

                break;
            } else if (otp1.equals(String.valueOf(otp))) {
                attempts++;
                JOptionPane.showMessageDialog(null, "OTP is correct but Transaction Code is incorrect! Attempts left: " + (3 - attempts));
            } else if (transaction.equals(jcode)) {
                attempts++;
                JOptionPane.showMessageDialog(null, "Transaction Code is correct but OTP is incorrect! Attempts left: " + (3 - attempts));
            } else {
                attempts++;
                JOptionPane.showMessageDialog(null, "OTP and Transaction Code are incorrect! Attempts left: " + (3 - attempts));
            }

            if (attempts < 3) {
                otp1 = JOptionPane.showInputDialog("Enter the OTP: ");
                transaction = JOptionPane.showInputDialog("Enter the Transaction Code: ");
            } else {
                JOptionPane.showMessageDialog(null, "Too many incorrect attempts. Exiting the program.");
                System.exit(0);
            }
        }
        
    }
    

    public static void main(String[] args) {
        JehoTian();
    }
}