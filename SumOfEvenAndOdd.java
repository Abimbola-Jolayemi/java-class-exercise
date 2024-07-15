import java.util.Scanner;

public class SumOfEvenAndOdd{
   public static void main(String []args){

	Scanner input = new Scanner(System.in);

	int evenSum = 0;
	int oddSum = 0;	
	
	System.out.println("Enter ten number: ");

	for(int index = 0; index < 10; index++){
		int number = input.nextInt();

		if(number % 2 == 0){
			evenSum = evenSum + number;
		}
		else{
			oddSum = oddSum + number;
		}
	}

	System.out.println("The sum of the even numbers: " + evenSum);
	System.out.print("The sum of the odd numbers: " + oddSum);
   }
}