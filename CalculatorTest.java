import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{

	@Test
	public void factorial(){

		Calculator calculator = new Calculator();
		
		int number = 5;
		int factorial = calculator.findFactorial(number);

		assertEquals(120, factorial);
	}

	@Test
	public void reverseNumber(){

		Calculator calculator = new Calculator();

		int number = 12345;
		int reversedNumber = calculator.reverseNumber(number);

		assertEquals(54321, reversedNumber);
	}

	@Test
	public void testForExponential(){

		Calculator calculator = new Calculator();

		int number1 = -2;
		int number2 = 0;
		double exponent = calculator.findExponential(number1, number2);

		assertEquals(1, exponent);
	}










}