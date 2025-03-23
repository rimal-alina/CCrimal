import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculatorGUI {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("BMI Rechner");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));
        
        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel weightLabel = new JLabel("Weight (kg):");
        JTextField weightField = new JTextField();
        JLabel heightLabel = new JLabel("Height (m):");
        JTextField heightField = new JTextField();
        JButton calculateButton = new JButton("Calculate BMI");
        JLabel resultLabel = new JLabel("Your BMI: ");
        JLabel interpretationLabel = new JLabel("");
        
        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(weightLabel);
        frame.add(weightField);
        frame.add(heightLabel);
        frame.add(heightField);
        frame.add(calculateButton);
        frame.add(resultLabel);
        frame.add(interpretationLabel);
        
        // Button action
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = nameField.getText().trim();
                    double weight = Double.parseDouble(weightField.getText());
                    double height = Double.parseDouble(heightField.getText());
                    double bmi = weight / (height * height);
                    
                    String bmiResult = name + ", your BMI is: " + String.format("%.2f", bmi);
                    resultLabel.setText(bmiResult);
                    
                    if (bmi < 18.5) {
                        interpretationLabel.setText("You are underweight.");
                    } else if (bmi >= 18.5 && bmi < 24.9) {
                        interpretationLabel.setText("You have a normal weight.");
                    } else if (bmi >= 25 && bmi < 29.9) {
                        interpretationLabel.setText("You are overweight.");
                    } else {
                        interpretationLabel.setText("You are obese.");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers.");
                    interpretationLabel.setText("");
                }
            }
        });
        
        // Set frame visibility
        frame.setVisible(true);
    }
}
