import javax.swing.JOptionPane;

public class AverageGrade {
    public static void main(String[] args) {
        
    	int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of subjects: "));
    	String [] subjects = new String[n];
        double [] grades = new double[n];
        inputSubjAndGrade(subjects, grades);
        
        double average = AverageCompute(grades);
        Results(subjects, grades, average);
    }

    public static void inputSubjAndGrade(String[] subjects, double[] grades) {
    	for (int i = 0; i<subjects.length; i++){
            subjects[i] = JOptionPane.showInputDialog("Enter subject name: ");

            boolean validInput = false;

            while (!validInput) {
                try {
                    String g = JOptionPane.showInputDialog("Enter grade for " + subjects[i] + ": ");
                    if (g == null) return;

                    grades[i] = Double.parseDouble(g);
                    
                    if (grades[i] >= 70 && grades[i] <= 100) {
                        validInput = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid grade! Enter a value between 70-100.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a numeric grade.");
                }
            }
        }
    }
    
    public static double AverageCompute(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
    
    public static void Results(String[] subjects, double[] grades, double average) {
        String message = "--- Grade Reports ---\n";
        
        for (int i = 0; i < subjects.length; i++) {
            message += subjects[i] + ": " + grades[i] + "\n";
        }
        message += "\nAverage Grade: " + String.format("%.2f", average) + " or " + Math.round(average)+".00";

        JOptionPane.showMessageDialog(null, message, "Grade Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
 
  

