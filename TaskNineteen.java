public class TaskNineteen{
   public static void main(String []args){

	double sum = 0;
	double sqrtSum = 0;

	for(int number = 1; number <= 10; number++){
		if (number % 4 == 0){
	
			for (int noOfTimes = 1; noOfTimes <= 5; noOfTimes++){
			   	double multipleOfFour = Math.pow(number, noOfTimes);

				sum = sum + multipleOfFour;
				sqrtSum = Math.pow(sum, 2);
			}
				   
		}
	} 
		System.out.printf("%.0f", sqrtSum);

   }
}



import java.util.Arrays;

public class ArraySquared{
   public static void main(String []args){

	int[] number = {2,1,9,5};
	int[] squared = new int[number.length];
	int maximum = 0;

	for(int index = 0; index <= number.length; index++){
		squared[index] = number[index] * number[index];
	}

	boolean isSkipped;

	for(int outerLoop = 0; outerLoop < number.length - 1; outerLoop1++){
		isSkipped = false;

		for(int innerLoop = 0; innerLoop < number.length - outerLoop - 1; innerLoop++){
			if(squared[innerLoop] > squared[innerLoop + 1]
		}
	}
   }
}