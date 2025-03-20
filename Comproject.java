import javax.swing.JOptionPane;

public class Comproject {
    public static void main(String[] args) {
        // Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the Fibonacci Sequence Calculator!");

        while (true) {
            int num = -1; // Initialize with a negative value to start the loop

            // Keep prompting until a valid input is received
            while (num <= 0) {
                try {
                    // Prompt user for input
                    String input = JOptionPane.showInputDialog("Enter the desired length of the Fibonacci sequence:");

                    // Check if the user wants to exit
                    if (input == null || input.trim().equalsIgnoreCase("exit")) {
                        JOptionPane.showMessageDialog(null, "Thank you for using the Fibonacci Sequence Calculator!");
                        System.exit(0); // Exit the program
                    }

                    // Basic input validation
                    if (input == null || input.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                        continue;
                    }

                    // Convert input to an integer
                    num = Integer.parseInt(input);

                    // Validate if the number is not positive
                    if (num <= 0) {
                        JOptionPane.showMessageDialog(null, "Please enter a positive integer.");
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a positive integer.");
                }
            }

            // Continue with Fibonacci sequence logic
            JOptionPane.showMessageDialog(null, "Valid number received: " + num);
            JOptionPane.showMessageDialog(null, "Calculating Fibonacci sequence up to " + num + " terms...");
            JOptionPane.showMessageDialog(null, "Please wait for a while to calculate the sequence.");

            try {
                Thread.sleep(2000); // Pause for 2000 milliseconds (2 seconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Generate Fibonacci sequence
            StringBuilder fibonacciSequence = new StringBuilder("The Fibonacci Sequence: ");
            for (int n = 0; n < num; n++) {
                int fibNumber = fibonacciSequence(n); // Calculate Fibonacci number
                fibonacciSequence.append(fibNumber).append(" ");
            }

            // Show the Fibonacci sequence in one dialog
            JOptionPane.showMessageDialog(null, fibonacciSequence.toString());

            JOptionPane.showMessageDialog(null, "Thank you for using the Fibonacci Sequence Calculator!");
            System.out.println("Program execution completed. The Fibonacci sequence has been calculated and displayed.\n" + fibonacciSequence);
            System.out.println("Thank You For Using Our Calculator!");
        }
    }

    // Recursive method to calculate Fibonacci number
    public static int fibonacciSequence(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
        }
    }
}