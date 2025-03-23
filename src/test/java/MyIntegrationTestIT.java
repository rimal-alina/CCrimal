import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class MyIntegrationTestIT {

     @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    
    // Integration Test 1: Test BMI calculation and category together for normal weight
    @Test
    public void testBMICalculationAndCategoryForNormalWeight() {
        double weight = 70;  
        double height = 1.75; 
        double bmi = BMICalculator.calculateBMI(weight, height); 
        String category = BMICalculator.getBMICategory(bmi); 
        String expectedCategory = "Normal weight"; 

        // Verify BMI calculation 
        assertEquals(22.86, bmi, 0.01); 

        // Verify category
        assertEquals(expectedCategory,category); 
    }

    // Integration Test 2 : Test BMI calculation and category together for obese
    @Test
    public void testBMICalculationAndCategoryForObese() {
        double weight = 100;  
        double height = 1.75; 
        double bmi = BMICalculator.calculateBMI(weight, height); 
        String category = BMICalculator.getBMICategory(bmi); 
        String expectedCategory = "Obese"; 

        
        assertEquals(32.65, bmi, 0.01); 

        
        assertEquals(expectedCategory,category); 
    }
}


