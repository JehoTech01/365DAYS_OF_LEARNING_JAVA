import java.util.Scanner;

public class SCANN{

    // Method to get a non-empty name from the user
    public static String getName(ScanAner scanner) {
        String name = "";
        while (name.isBlank()) {
            System.out.print("Enter your Name: ");
            name = scanner.nextLine();
        }
        return name;
    }

    // Method to get the user's age
    public static int getAge(Scanner scanner, String name) {
        System.out.print("How old are you, " + name + "? ");
        return scanner.nextInt();
    }

    // Method to get a line of input for address, course, or university
    public static String getInputLine(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Method to get the user's height
    public static double getHeight(Scanner scanner, String name) {
        System.out.print("How tall are you, " + name + "? ");
        return scanner.nextDouble();
    }

    // Main interaction method
    public static void collectUserData() {
        Scanner scanner = new Scanner(System.in);

        // Collect and display user details
        String name = getName(scanner);
        System.out.println("Hello " + name + "!");

        int age = getAge(scanner, name);
        scanner.nextLine(); // Clear the buffer

        String address = getInputLine(scanner, "Where are you from, " + name + "? ");
        String course = getInputLine(scanner, "What is your course, " + name + "? ");
        String university = getInputLine(scanner, "What college are you currently enrolled in, " + name + "? ");
        double height = getHeight(scanner, name);

        // Display collected data
        System.out.println("\nCollected Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Course: " + course);
        System.out.println("University: " + university);
        System.out.println("Height: " + height + " meters");

        scanner.close();
    }

    public static void main(String[] args) {
        collectUserData();
    }
}
