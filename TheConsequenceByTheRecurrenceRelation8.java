import java.util.Scanner;

public class TheConsequenceByTheRecurrenceRelation8 {
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

        switch (arrLen) {

            case 1:
                newArray[0] = 1;
                break;
            case 2:
                newArray[0] = 1;
                newArray[1] = 2;
                break;
            case 3:
                newArray[0] = 1;
                newArray[1] = 2;
                newArray[2] = 4;
                break;
            case 4:
                newArray[0] = 1;
                newArray[1] = 2;
                newArray[2] = 4;
                newArray[3] = 8;
                break;


        }


        if (arrLen > 4) {

            newArray[0] = 1;
            newArray[1] = 2;
            newArray[2] = 4;
            newArray[3] = 8;

            for (int i = 4; i < arrLen; i++) {


                // ----------------------------check to the overflow

           /* if (b2 * 3 - b1 * 2 < 0) {

                System.out.printf("There are overflow on the %d position!\n", i);
                n = 0;

            } else {*/

                // ----------------------------/check to the overflow


                newArray[i] = newArray[i - 4];

            }
        }


        //---------------------------- /adding new elements to array

        //---------------------------- print elements of array

        for (int j = 0; j < arrLen; j++) {

            System.out.print(newArray[j]);

            if (j != arrLen - 1) System.out.print(", ");
        }
        //---------------------------- /print elements of array

        System.out.println("\nThe end!");

    }

}

