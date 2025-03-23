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

}

