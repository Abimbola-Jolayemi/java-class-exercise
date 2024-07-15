public class Calculator{
   
	public int findFactorial(int number){
		int factorial = 1;

		for(int index = 0; index < number; index++){
			factorial = factorial * (number - index);
		}

		return factorial;
	}

	public int reverseNumber(int number){
		int reversed = 0;
        	while (number != 0) {
           		 int digit = number % 10;
            		reversed = reversed * 10 + digit;
           		 number /= 10;
       		 }
        	return reversed;
	}

	public static int findExponential(int base, int exponent) {
        	int result = 1;
        	for (int index = 0; index < exponent; index++) {
            	result *= base;
        	}
        	return result;
	}
	
}