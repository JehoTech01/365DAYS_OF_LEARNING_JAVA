
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
public class SeatWork2 {

  private static JTextField transactCodeField;
  private static JTextField otpField;

  public static void main(String[] args) {
    
    
  
  //JFrame
  JFrame Frame = new JFrame("GcashClone");//TITLE OF THE FRAME
  Frame.setSize(800, 800);//SIZE OF THE FRAME
  Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//EXIT BUTTON
  Frame.setVisible(true);//TO BE TRUE THE FRAME
  
  
  
  JPanel panel = new JPanel();
  panel.setLayout(new GridLayout(20,20));
  panel.setBackground(Color.lightGray);

  JLabel nameLabel = new JLabel("Name:");
  JTextField nameField = new JTextField();

  JLabel ageLabel = new JLabel("Age:");
  JTextField ageField = new JTextField();

  JLabel addressLabel = new JLabel("Address:");
  JTextField addressField = new JTextField();

  JLabel contactLabel = new JLabel("Contact Number:");
  JTextField contactField = new JTextField();

  JLabel ammounttoBesentLabel = new JLabel("Amount to be sent:");
  JTextField ammounttoBesentField = new JTextField();



  JLabel transactCodeLabel = new JLabel("Transaction Code:");
  JTextField transactCodeField = new JTextField();
  transactCodeField.setEditable(false);
  JLabel otpLabel = new JLabel("OTP: ");
  JTextField otpField = new JTextField();
  otpField.setEditable(false);

  JButton submit1Button = new JButton("Submit");
  submit1Button.setBackground(Color.pink); 
  submit1Button.setSize(20, 20);
  


  JLabel enterTransactLabel = new JLabel("Enter Transaction Code:");
  JTextField enterTransactField = new JTextField();

 String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
  String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  String numbers = "0123456789";
  String symbols = "!@#$%^&*()_+-=[]{}|;:,.<>?";

  String values = lowercaseLetters + uppercaseLetters + numbers + symbols;
  Random random = new Random();
  int length =6;
  
  StringBuilder password = new StringBuilder(length);
  for (int i = 0; i < length; i++) {
    int index = random.nextInt(values.length());
    password.append(values.charAt(index));
  }
    transactCodeField.setText(password.toString());
    submit1Button.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
      }
      
    });




          
    JLabel otp1Label = new JLabel("Enter the OTP:");
    JTextField otp1Field = new JTextField();
    JButton submitButton = new JButton("Submit");
    submitButton.setBackground(Color.blue); 
    submitButton.setSize(20, 20);

    submit1Button.addActionListener((ActionEvent e) -> {
        generateTransactionCode();
        generateOTP();
  });
  submitButton.addActionListener((ActionEvent e) -> {
      String enteredTransactCode = enterTransactField.getText();
      String enteredOTP = enterOTPField.getText();
      if (enteredTransactCode.equals("") && enteredOTP.equals("")) {
          JOptionPane.showMessageDialog(Frame, "Please enter Transaction Code and OTP!");
      } else if (enteredTransactCode.equals(transactCodeField.getText()) && enteredOTP.equals(otpField.getText())) {
          JOptionPane.showMessageDialog(Frame, "Transaction Code and OTP are correct!");
      } else if (enteredTransactCode.equals(transactCodeField.getText())) {
          JOptionPane.showMessageDialog(Frame, "Transaction Code is correct but OTP is incorrect!");
      } else if (enteredOTP.equals(otpField.getText())) {
          JOptionPane.showMessageDialog(Frame, "OTP is correct but Transaction Code is incorrect!");
      }
      else if (enteredTransactCode.equals("") && enteredOTP.equals("")) {
          JOptionPane.showMessageDialog(Frame, "Please enter Transaction Code and OTP!");
      } else {
          JOptionPane.showMessageDialog(Frame, "Transaction Code and OTP are incorrect!");
      }
  });
    /*submitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if  (otpField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(Frame, "Enter a valid OTP!");
            } else if (otp1Field.getText().equals(otpField.getText())) {
                JOptionPane.showMessageDialog(Frame, "OTP is correct!, Congratulations!" + "\n\n" + "Collected Info: \n"+ "Name: " + nameField.getText() + "\n" + "Age: " + ageField.getText() + "\n" + "Address: " + addressField.getText());
            } else {     
                JOptionPane.showMessageDialog(Frame, "OTP is incorrect enter the valid OTP!");
            }
        }
    });*/



  panel.add(nameLabel);
  panel.add(nameField);
  panel.add(ageLabel);
  panel.add(ageField);
  panel.add(addressLabel);
  panel.add(addressField);
  panel.add(contactLabel);
  panel.add(contactField);
  panel.add(ammounttoBesentLabel);
  panel.add(ammounttoBesentField);
  panel.add(transactCodeLabel);
  panel.add(transactCodeField);
  panel.add(otpLabel);
  panel.add(otpField);
  panel.add(submit1Button);

  panel.add(otp1Label);
  panel.add(otp1Field);
  panel.add(enterTransactLabel);
  panel.add(enterTransactField);
  panel.add(submitButton);




  Frame.add(panel);

  Frame.setVisible(true);
  }
  private static void generateTransactionCode() {
    String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>?";
    int length = (int) Math.ceil(Math.random() * 4) + 6; // Generates a length between 6 and 10
    transactCodeField.setText(generateRandomString(characters, length));
}

// Method to Generate Random OTP (Numeric Only)
private static void generateOTP() {
    String numbers = "0123456789";
    int otpLength = (int) Math.ceil(Math.random() * 2) + 4; // OTP length between 4 and 6
    otpField.setText(generateRandomString(numbers, otpLength));
}

// Generic Method to Generate a Random String
private static String generateRandomString(String characters, int length) {
    StringBuilder result = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
        int index = Math.abs((int) (Math.random() * characters.length())); // Ensures positive index
        result.append(characters.charAt(index));
    }
    return result.toString();
}
}
