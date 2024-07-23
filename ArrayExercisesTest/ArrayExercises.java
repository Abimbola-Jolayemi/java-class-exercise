import java.util.Arrays;

public class ArrayExercises{
   public static void main (String []args){

	ArrayFunction myArray = new ArrayFunction();

	int[] number = {23, 76, 21, 78, 54};

	int[] sortedArray = myArray.sortArray(number);

	System.out.print(sortedArray);
	
}

}