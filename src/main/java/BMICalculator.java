import javax.swing.*;
import java.awt.*;


public class BMICalculator {
    public static void main(String[] args) {
        // Create the frame
        final JFrame frame = new JFrame("BMI Calculator");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        // Create components
        final JLabel nameLabel = new JLabel("Name:");
        final JTextField nameField = new JTextField();
        final JLabel weightLabel = new JLabel("Weight (kg):");
        final JTextField weightField = new JTextField();
        final JLabel heightLabel = new JLabel("Height (m):");
        final JTextField heightField = new JTextField();
        final JButton calculateButton = new JButton("Calculate BMI");
        final JLabel resultLabel = new JLabel("Your BMI: ");
        final JLabel interpretationLabel = new JLabel("");

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
        calculateButton.addActionListener(e -> {
            try {
                String name = nameField.getText().trim();
                double weight = Double.parseDouble(weightField.getText());
                double height = Double.parseDouble(heightField.getText());

                double bmi = calculateBMI(weight, height);
                String bmiCategory = getBMICategory(bmi);

                resultLabel.setText(name + ", your BMI is: " + String.format("%.2f", bmi));
                interpretationLabel.setText(bmiCategory);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numbers.");
                interpretationLabel.setText("");
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        if (height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Height and weight must be greater than zero.");
        }
        return weight / (height * height);
    }

    // Method to determine BMI category
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return " Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
