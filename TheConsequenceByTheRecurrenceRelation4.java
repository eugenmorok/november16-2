import java.util.Scanner;

public class TheConsequenceByTheRecurrenceRelation4 {
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


        //---------------------------- adding new elements to array
        int[] newArray = new int[arrLen];

        //int nDiffOne = 0;
        int n = 5;
        newArray[0] = n;

        int baseForPower = -1;
        int degreeOfPower = 0;
        int resultOfPower = 0;


        for (int i = 1; i < arrLen; i++) {


            //---------------------------- powers work

            degreeOfPower = n;
            if (n < 0) degreeOfPower = -1 * n;

            resultOfPower = baseForPower;

            while (degreeOfPower > 1) {
                resultOfPower = resultOfPower * baseForPower;
                //System.out.println(resultOfPower);
                degreeOfPower--;
            }

            //---------------------------- /powers work


            //nDiffOne = n;

            n = (resultOfPower * n) - 8;


            // ----------------------------check to the overflow

            /* if (n < 0 && nDiffOne < 0) {

                System.out.printf("There are overflow on the %d position!\n", i);
                n = 0;

            } else if (n > 0 && nDiffOne > 0) {

                System.out.printf("There are overflow on the %d position!\n", i);
                n = -1;
            } */

            // ----------------------------/check to the overflow


            newArray[i] = n;


        }
        //---------------------------- /adding ne elements to array

        //---------------------------- print elements of array
        for (int j = 0; j < arrLen; j++) {
            System.out.print(newArray[j]);
            if (j != arrLen - 1) System.out.print(", ");
        }
        //---------------------------- /print elements of array


        System.out.println("\nThe end!");

    }
}
