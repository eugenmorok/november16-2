import java.util.Scanner;

public class GuessTheConsequenceByTheHumanBrain13 {
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

        int[] finalArray = new int[arrLen];

        int i = 1;
        finalArray[0] = 1;

        while (i < arrLen) {
            finalArray[i] = i * finalArray[i - 1];
            i++;
        }


        //---------------------------- print elements of array
        for (int j = 1; j < arrLen; j++) {
            System.out.print(finalArray[j]);
            if (j != arrLen - 1) System.out.print(", ");
        }
        //---------------------------- /print elements of array


        System.out.println("\nThe end!");

    }
}
