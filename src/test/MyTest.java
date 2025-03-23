import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BMITest 
{
   
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    // Test 1: BMI Test calculation for underweight
    @Test
    public void testBMIUnderweight() {
        double weight = 50;  
        double height = 1.75; 
        double expectedBMI = 16.33; // expected BMI value
        double result = BMICalculator.calculateBMI(weight, height);
        assertEquals(expectedBMI, result, 0.01); // Use delta to handle floating-point comparison
    }


    // Test 2: BMI category check for obese
    @Test
    public void testBMICategoryObese() {
        double bmi = 32.65; // BMI value for obese
        String expectedCategory = "Obese"; // Expected category
        String result = BMICalculator.getBMICategory(bmi);
        assertEquals(expectedCategory,result); // Check if the category matches
    }

    // **Integration Test**: Test BMI calculation and category together for normal weight
    @Test
    public void testBMICalculationAndCategoryForNormalWeight() {
        double weight = 70;  
        double height = 1.75; 
        double bmi = BMICalculator.calculateBMI(weight, height); 
        String category = BMICalculator.getBMICategory(bmi); 
        String expectedCategory = "Normal weight"; 

        // Verify that BMI calculation is correct
        assertEquals(22.86, bmi, 0.01); 

        // Verify that the category is "Normal weight"
        assertEquals(expectedCategory,category); 
    }

    // **Integration Test**: Test BMI calculation and category together for obese
    @Test
    public void testBMICalculationAndCategoryForObese() {
        double weight = 100;  // kg
        double height = 1.75; // meters
        double bmi = BMICalculator.calculateBMI(weight, height); // BMI calculation
        String category = BMICalculator.getBMICategory(bmi); // BMI category determination
        String expectedCategory = "Obese"; // Expected category

        // Verify that BMI calculation is correct
        assertEquals(32.65, bmi, 0.01); 

        // Verify that the category is "Obese"
        assertEquals(expectedCategory,category); 
    }
}

