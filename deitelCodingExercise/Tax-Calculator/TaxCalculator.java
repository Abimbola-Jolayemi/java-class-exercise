public class TaxCalculator{

	public double calculateTax(int earning){
		double tax;

		if (earning < 0)
			throw new RuntimeException("Invalid amount");
		else if (earning > 0 && earning <= 30000)
			tax = earning * 0.15;
		else
			tax = earning * 0.20;

		return tax; 
	}
}