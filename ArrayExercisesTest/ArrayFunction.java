import java.util.Arrays;

public class ArrayFunction{

   public static int[] sortArray(int[] numbers){
	int ascendingNumber = 0;
	for (int index = 0; index < numbers.length; index++){
		if (numbers[index] >= ascendingNumber){
			ascendingNumber = numbers[index];
			int[] sorts = ascendingNumber;
		}
		return (Arrays.toString(sorts));
	}

	return (Arrays.toString(sorts));
   }

}