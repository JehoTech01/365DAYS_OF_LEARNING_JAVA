import java.util.Scanner;

public class StudInfoSW1 {

    public static void meThod() {
        Scanner scanner = new Scanner(System.in);

        /* String name = "";
        while (name.isBlank()) {        } THIS FUNCTION WILL ASK THE USER FOR HIS/HER NAME TO INPUT A VALID NAME. IF HE/SHE DID NOT INPUT ANY NAME IT WILL LOOP ASKING FOR A NAME AGAIN     AND AGAIN*/
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");

        System.out.print("How Old Are You, " + name + "?: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Where are you from, " + name + "?: ");
        String address = scanner.nextLine();

        System.out.print("What is your course, " + name + "?: ");
        String course = scanner.nextLine();

        System.out.print("What college are you currently enrolled in, " + name + "?: ");
        String university = scanner.nextLine();

        System.out.print("How tall are you, " + name + "?: ");
        double height = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nCollected Info: ");
        System.out.println("Name: " + name + "\nAge: " + age + "\nAddress: "
         + address + "\nCourse: " + course + "\nCollege: " + university +
          "\nHeight: " + height);


        forMula(scanner);
        scanner.close();
    }
    public static void forMula(Scanner scanner){
    /*  while (true) { 
        } //THIS FUNCTION WILL LOOP THE USER TO PUT A VALID INPUT, EXAMPLE IF THE USER PUT N or Y, it will ask again to put a valid input(YES OR NO)    */
        System.out.print("\nDo you want to enter another information again? (yes/no): ");
        String response = scanner.nextLine().trim().toLowerCase();
        if (response.equals("yes")) {
            meThod();
        } else if (response.equals("no")) {
            System.out.println("Goodbye!");
        } else {
            System.out.println("Invalid Input Babyeeeeeeeeeeeeeeeeeeeee!!!!!!!!!!!!!!!!!!");
  
        }

    }
    public static void main(String[] args) {
        meThod();
    }
}
