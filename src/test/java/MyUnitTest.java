import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MyUnitTest 
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
        double expectedBMI = 16.33; 
        double result = BMICalculator.calculateBMI(weight, height);
        assertEquals(expectedBMI, result, 0.01); 
    }


    // Test 2: BMI category check for obese
    @Test
    public void testBMICategoryObese() {
        double bmi = 32.65; 
        String expectedCategory = "Obese"; 
        String result = BMICalculator.getBMICategory(bmi);
        assertEquals(expectedCategory,result); 

    }
}



