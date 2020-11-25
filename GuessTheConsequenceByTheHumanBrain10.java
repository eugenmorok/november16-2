import java.util.Scanner;

public class GuessTheConsequenceByTheHumanBrain10 {
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

        finalArray[0] = 99;

        while (i < arrLen) {

            if ((finalArray[i - 1] - 25) > 0 && i > 3) {
                System.out.printf("There are overflow on the %d position\n", i);
                finalArray[i] = -1;
            } else {

                finalArray[i] = finalArray[i - 1] - 25;
            }
            i++;
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
