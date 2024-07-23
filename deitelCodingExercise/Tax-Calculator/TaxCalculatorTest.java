import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TaxCalculatorTest{

	@Test
	public void testThatCalculateTaxForEarningsUpTo30_000(){
	
		TaxCalculator calculator = new TaxCalculator();

		assertThrows(RuntimeException.class, () -> calculator.calculateTax(-30000));
	}

	
	
 
}