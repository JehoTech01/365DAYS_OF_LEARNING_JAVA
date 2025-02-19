import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;

public class frame {
    private static JTextField transactCodeField;
    private static JTextField otpField;

    public static void main(String[] args) {
        JFrame Frame = new JFrame("Transaction Code & OTP Generator");
        Frame.setSize(800, 800);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setLayout(new GridLayout(35, 20));
        Frame.getContentPane().setBackground(Color.gray);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(20, 20));


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
        transactCodeField = new JTextField();
        transactCodeField.setEditable(false);

        JLabel otpLabel = new JLabel("OTP:");
        otpField = new JTextField();
        otpField.setEditable(false);

        JButton submit1Button = new JButton("Generate Codes");
        submit1Button.setBackground(Color.cyan);

        JLabel enterTransactLabel = new JLabel("Enter Transaction Code:");
        JTextField enterTransactField = new JTextField();

        JLabel enterOTPLabel = new JLabel("Enter OTP:");
        JTextField enterOTPField = new JTextField();

        JLabel submitButtonJLabel = new JLabel("Submit");
        JButton submitButton = new JButton("Submit");
        submitButton.setBackground(Color.PINK);

        submit1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateTransactionCode();
                generateOTP();
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                } else if (enteredTransactCode.equals("") && enteredOTP.equals("")) {
                    JOptionPane.showMessageDialog(Frame, "Please enter Transaction Code and OTP!");
                } else {
                    JOptionPane.showMessageDialog(Frame, "Transaction Code and OTP are incorrect!");
                }
            }
        });

        Frame.add(nameLabel);
        Frame.add(nameField);
        Frame.add(ageLabel);
        Frame.add(ageField);
        Frame.add(addressLabel);
        Frame.add(addressField);
        Frame.add(contactLabel);
        Frame.add(contactField);
        Frame.add(ammounttoBesentLabel);
        Frame.add(ammounttoBesentField);
        ammounttoBesentField.setText(String.valueOf((int) (Math.random() * (1500 - 1000 + 1) + 1000)));

        Frame.add(transactCodeLabel);
        Frame.add(transactCodeField);
        Frame.add(otpLabel);
        Frame.add(otpField);
        Frame.add(submit1Button);
        Frame.add(enterTransactLabel);
        Frame.add(enterTransactField);
        Frame.add(enterOTPLabel);
        Frame.add(enterOTPField);
        Frame.add(submitButtonJLabel);
        Frame.add(submitButton);

        Frame.setVisible(true);
        Frame.add(panel);
        Frame.setVisible(true);
    }

    public static void forMula(Scanner scanner) {
        while (true) {
            JOptionPane.showMessageDialog(null, "Do you want to enter another information again? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("yes")) {
                generateOTP();
            } else if (response.equals("no")) {
               JOptionPane.showMessageDialog(null, "Goodbye!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Input Babyeeeeeeeeeeeeeeeeeeeee!!!!!!!!!!!!!!!!!!");
            }
        }
    }

    private static void generateTransactionCode() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>?";
        int length = (int) Math.ceil(Math.random() * 4) + 6;
        transactCodeField.setText(generateRandomString(characters, length));
    }

    private static void generateOTP() {
        String numbers = "0123456789";
        int otpLength = (int) Math.ceil(Math.random() * 2) + 4;
        otpField.setText(generateRandomString(numbers, otpLength));
    }

    private static String generateRandomString(String characters, int length) {
        StringBuilder result = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = Math.abs((int) (Math.random() * characters.length()));
            result.append(characters.charAt(index));
        }
        return result.toString();
    }
}
