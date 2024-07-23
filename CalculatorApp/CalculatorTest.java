import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest{

   @Test
   public void testThatCalculatorCanAddTwoPositiveNumbers(){

	//given
	Calculator calculator = new Calculator();

	//when
	int result = calculator.add(2, 3);

	//assert
	assertEquals(5, result);
   }

	@Test
	public void testThatCalculatorCanSubtractTwoPositiveNumber(){

		//given
		Calculator calculator = new Calculator();

		//when
		int result = calculator.subtract(3, 2);

		//assert
		assertEquals(1, result);
	}

	
	@Test
	public void testThatCalculatorCanMultiplyTwoPositiveNumbers(){

		//given
		Calculator calculator = new Calculator();
		
		//when
		int product = calculator.multiply(2, 4);

		//assert
		assertEquals(8, product);
	}

	@Test
	public void testThatCalculatorCanDivideTwoPositiveNumbers(){
	
		//given
		Calculator calculator = new Calculator();

		//when
		int quotient = calculator.divide(4, 2);

		//assert
		assertThrows(ArithmeticException.class, () -> calculator.divide(4, 0));
	}








}