import java.util.Scanner;

public class MaximumAndMinimum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        

        for(int index = 1; index <= 10; index++) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }

        }

        System.out.println("Largest number entered: " + largest);
        System.out.println("Smallest number entered: " + smallest);

    }
}