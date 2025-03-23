import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MyIntegrationTestIT 
{
   
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
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
