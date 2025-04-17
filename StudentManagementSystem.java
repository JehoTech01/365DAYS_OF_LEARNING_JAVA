
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class StudentManagementSystem {

  public static void function1() {
    ArrayList<String> Students = new ArrayList<>();
    System.out.println("1. Add Student");
    System.out.println("2. Remove Student");
    System.out.println("3. View Students");
    System.out.println("4. Search Student");
    System.out.println("5. Update Student");
    System.out.println("6. Save & Exit");

    System.out.println("Enter your choice: ");
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    scanner.nextLine();

    switch(choice) {
      case 1:
        break;  
      case 2:
        

        break;
      case 3:
        
        break;
      case 4:
        
        break;
      case 5:
        
        break;
      default:
        System.out.println("Invalid choice");
    }


  }

  public static void addStudent(int function1, double studentAvg) {

    ArrayList<String> Students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    
    System.out.println("Enter Student Name: ");
    String name = sc.nextLine();
      while(name==null|| name.trim().isEmpty() || name.matches(".*\\d.*")){
        System.out.println("Invalid Name");
        name = sc.nextLine();
        }
      
    int studentID = rand.nextInt(1000) + 100; // Generate ID between 100 and 1100
    System.out.println("Student ID: " + studentID);
    Students.add("Name: " + name + ", ID: " + studentID); // Add student to the list



    System.out.println("Number of Grades: ");
    int numGrades = sc.nextInt();



    for(int i =0; i < numGrades; i++){
      System.out.println("Enter Grade "+(i+1) +": ");
      int grade;

      


        // dito parang may mali ta purus invalid yung garade

            while (true) {
                try {
                    grade = sc.nextInt(); // Read the grade
                    if (grade >= 70 && grade <= 100) {
                        break; // Exit the loop if the grade is valid
                    } else {
                        System.out.println("Invalid Grade! Please enter a grade between 70 and 100.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    sc.next(); // Clear the invalid input
                }
                
            }



    }
    double average = studentAvg(grade);
    System.out.println("Student Average: " + average );

  

  }
  
  public static void removeStudent() {
    ArrayList<String> Students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Student ID: ");
    String name = sc.nextLine();

    Students.remove(name);
  }
  
  public static float studentAvg(float[] grade) {
    float sum = 0;
      for (int i = 0; i < grade.length; i++) {
        sum += grade[i]; // Add the grade to the sum
      }
      return sum / grade.length;
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
  public static void main(String[] args) {
    function1();
    

  }
  
}
