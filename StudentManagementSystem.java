
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentManagementSystem {
//📅 March 20, 2025
//📅 March 20, 2025
//📅 March 20, 2025

private static ArrayList<String> Students = new ArrayList<>();

public static void function1() {
    System.out.println("1. Add Student");
    System.out.println("2. Remove Student");
    System.out.println("3. View Students");
    System.out.println("4. Search Student");
    System.out.println("5. Update Student");
    System.out.println("6. Save & Exit");

    System.out.println("Enter your choice: ");
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    switch(choice) {
        case 1:
            addStudent();
            break;
        case 2:
            removeStudent();
            break;
        case 3:
            viewStudent();
            break;
        case 4:
            searchStudent();
            break;
        case 5:
            
            break;
        default:
            System.out.println("Invalid choice");
    }
}

public static void addStudent() {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("Enter Student Name: ");
    String name = sc.nextLine();
    while(name == null || name.trim().isEmpty() || name.matches(".*\\d.*")) {
        System.out.println("Invalid Name");
        name = sc.nextLine();
    }

    int studentID = rand.nextInt(1000) + 100;
    System.out.println("Student ID: " + studentID);

    System.out.println("Number of Grades: ");
    int numGrades = sc.nextInt();
    
    // Create array to store grades
    float[] grades = new float[numGrades];
    
    for(int i = 0; i < numGrades; i++) {
        System.out.println("Enter Grade " + (i+1) + ": ");
        while (true) {
            try {
                float grade = sc.nextFloat();
                if (grade >= 70 && grade <= 100) {
                    grades[i] = grade;
                    break;
                } else {
                    System.out.println("Invalid Grade! Please enter a grade between 70 and 100.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.next(); // Clear the invalid input
            }
        }
    }
    
    // Calculate and display average
    float average = studentAvg(grades);
    System.out.println("Student Average: " + average);
    
    // Add student to list with their average
    try {
        FileWriter writer = new FileWriter("StudentInfo.txt", true); // 'true' to append to file
        writer.write("Name: " + name + ", ID: " + studentID + ", GPA: " + average + "\n");
        writer.close();
        System.out.println("Student info saved to StudentInfo.txt!");
    } catch (IOException e) {
        System.out.println("An error occurred while saving the data.");
        e.printStackTrace();
    }


}

public static void viewStudent(){
  Scanner scanner = new Scanner(System.in);

  int pin = 41506;
  System.out.println("Only The ADMIN can Access this: ");

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

    File file = new File("StudentInfo.txt");

    try {
    BufferedReader reader = new BufferedReader(new FileReader(file));
    String line;

    System.out.println("===== Student Records =====");

    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }

    reader.close();

} catch (FileNotFoundException e) {
    System.out.println("StudentInfo.txt not found!");
} catch (IOException e) {
    System.out.println("An error occurred while reading the file.");
    e.printStackTrace();
}

      

  

    //File studObj = new File("StudentInfo");
}   

public static float studentAvg(float[] grades) {
    float sum = 0;
    for (float grade : grades) {
        sum += grade;
    }
    return sum / grades.length;
}

    public static void removeStudent() {
        Scanner sc = new Scanner(System.in);
        String filePath = "StudentInfo.txt";

        System.out.print("Number: ");
        int number = sc.nextInt();

        try{
            List<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(filePath)));
            if (number < 0 || number >= lines.size()) {
                System.out.println("Invalid number. No student removed.");
            } else {
                lines.remove(number);
                Files.write(Paths.get(filePath), lines);
                System.out.println("Student removed successfully.");
            }
        }catch (IOException e) {
            System.out.println("An error occurred while removing the student.");
            e.printStackTrace();
        }
        
        sc.close();
    }



    public static void searchStudent() {
        ArrayList<String> Students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID: ");
        String name = sc.nextLine();

        if(Students.contains(name)) {
            System.out.println("Student found");
        } else {
            System.out.println("Student not found");
        }
    }

    public static void updateStudent() {
        ArrayList<String> Students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID: ");
        String name = sc.nextLine();

        if(Students.contains(name)) {
            System.out.println("Student found");
            System.out.println("Enter new Student ID: ");
            String newName = sc.nextLine();
            Students.set(Students.indexOf(name), newName);
        } else {
            System.out.println("Student not found");
        }
    }

    public static void main(String[] args) {
        //StudentManagementSystem obj = new StudentManagementSystem();
        while(true) {
            function1();
            System.out.println("\nPress Enter to continue...");
            new Scanner(System.in).nextLine(); // Wait for Enter key

            
        }
        scanner.close();
    }

}
