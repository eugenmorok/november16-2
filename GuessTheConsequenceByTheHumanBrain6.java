import java.util.Scanner;

public class GuessTheConsequenceByTheHumanBrain6 {
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
        int k = 0;

        finalArray[0] = 1;

        while (i < arrLen) {

            k++;

            if (k <= 4) {
                finalArray[i] = finalArray[i - 1] + 1;
            } else if (k > 4) {
                finalArray[i] = finalArray[i - 1] - 1;
            }

            if(k == 8) k = 0;

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
