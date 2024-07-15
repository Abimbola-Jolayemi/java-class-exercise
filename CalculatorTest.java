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
}