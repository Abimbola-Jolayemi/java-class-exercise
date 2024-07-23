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

	public static double findExponential(int base, int exponent) {
        	double result = 1.0;
		double power = 1.0;

		if (base < 0 && exponent < 0){
			  int digit1 = base / -1;
			  int digit2 = exponent / -1;
			for (int index = 1; index <= digit2; index++){
            		  power *= digit1;
        		}
			result = -1.0 / power;
		}
		else if (base > 0 && exponent < 0){
			  int digit2 = exponent / -1;
			for (int index = 1; index <= digit2; index++){
            		  power *= base;
        		}
			result = 1.0 / power;
		}
		else if (base < 0 && exponent < 0){
			  int digit1 = base / -1;
			for (int index = 1; index <= exponent; index++){
            		  power *= digit1;
        		}
			result = -1 * power;
		}
		else if (base > 0 && exponent == 0){
			result = 1;
		}
		else{
			for (int index = 0; index < exponent; index++) {
            		   result *= base;
        		}
		} 
        	
        	return result;
	}
}