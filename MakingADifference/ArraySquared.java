public class ArraySquared {
    public static void main(String[] args) {
        int[] number = {-7, 2, 1, 9, 5};
        int[] squared = new int[number.length];

        for (int index = 0; index < number.length; index++) {
            squared[index] = number[index] * number[index];
        }

        for (int outerLoop = 0; outerLoop < squared.length - 1; outerLoop++) {
            for (int innerLoop = 0; innerLoop < squared.length - outerLoop - 1; innerLoop++) {
                if (squared[innerLoop] > squared[innerLoop + 1]) {
                    int temp = squared[innerLoop];
                    squared[innerLoop] = squared[innerLoop + 1];
                    squared[innerLoop + 1] = temp;
                }
            }
        }

        System.out.println("Squared Numbers in Ascending Order:");
        for (int i = 0; i < squared.length; i++) {
            System.out.print(squared[i] + " ");
        }
    }
}
