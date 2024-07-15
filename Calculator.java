public class Calculator{
   
	public int findFactorial(int number){
		int factorial = 1;

		for(int index = 0; index < number; index++){
			factorial = factorial * (number - index);
		}

		return factorial;
	}

	public i reverseNumber(int number){
	
		int digit1 = number % 10;
		number = number / 10;

		int digit2 = number % 10;
		number = number / 10;

		int digit3 = number % 10;
		number = number / 10;

		int digit4 = number % 10;
		number = number / 10;

		int digit5 = number % 10;

		return (digit1, digit2, digit3, digit4, digit5);
	}
	
}