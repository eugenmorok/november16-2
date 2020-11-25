import java.util.Scanner;

public class GuessTheConsequenceByTheHumanBrain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //---------------------------- pass check to length
        int arrLen = 0;
        boolean isPassCorrect = false;

        while (!isPassCorrect) {
            System.out.print("Enter array length: ");
            arrLen = sc.nextInt();
            if (arrLen > 0) isPassCorrect = true;
            else System.out.print("You array length is incorrect, try again. ");
        }
        //---------------------------- /pass check to length

        double[] finalArray = new double[arrLen];
        int[] topArray = new int[arrLen];
        int[] bottomArray = new int[arrLen];

        topArray[0] = 1;
        bottomArray[0] = 1;
        finalArray[0] = 1;

        for (int i = 1; i < arrLen; i++) {
            topArray[i] = topArray[i - 1] + 1;
            bottomArray[i] = bottomArray[i - 1] + 2;
            finalArray[i] = (double)(topArray[i]) / (double)(bottomArray[i]);
        }


        //---------------------------- print elements of array
        for (int j = 0; j < arrLen; j++) {
            System.out.print(finalArray[j]);
            if (j != arrLen - 1) System.out.print(", ");
        }
        //---------------------------- /print elements of array


        System.out.println("\nThe end!");

    }
}
