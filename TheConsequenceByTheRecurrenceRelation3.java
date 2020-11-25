import java.util.Scanner;

public class TheConsequenceByTheRecurrenceRelation3 {
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

        int nDiffOne = 0;
        int n = -3;
        newArray[0] = n;


        for (int i = 1; i < arrLen; i++) {

            nDiffOne = n;

            n = 9 - (n * 2);


            // ----------------------------check to the overflow

            if (n < 0 && nDiffOne < 0) {

                System.out.printf("There are overflow on the %d position!\n", i);
                n = 0;

            } else if (n > 0 && nDiffOne > 0) {

                System.out.printf("There are overflow on the %d position!\n", i);
                n = -1;
            }

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
