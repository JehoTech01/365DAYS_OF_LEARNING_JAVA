import java.util.Scanner;

public class Stud {
	
	public static void meThod(){
		        Scanner scanner = new Scanner(System.in);
		        
		        
	String name = "";
		        while (name.isBlank()) {
            System.out.print("Enter your Name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name + "!");

        System.out.print("How Old Are You, " + name + "? ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        System.out.print("Where are you from, " + name + "? ");
        String address = scanner.nextLine();

        System.out.print("What is your course, " + name + "? ");
        String course = scanner.nextLine();

        System.out.print("What college are you currently enrolled in, " + name + "? ");
        String university = scanner.nextLine();

        System.out.print("How tall are you, " + name + "? ");
        double height = scanner.nextDouble();

        scanner.close();
	}
    public static void main(String[] args) {
    meThod();

    	


	

        
    }
}
