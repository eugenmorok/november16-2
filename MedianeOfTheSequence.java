import java.util.Scanner;

public class MedianeOfTheSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array length here: ");
        int arrayLen = sc.nextInt();

        int[] newArray = new int[arrayLen];

        int count = 1;


        for (int j = 1; j < arrayLen; j++) {

            //---------------------------- powers work

            int baseForPower = 3;
            int degreeOfPower = j;
            int resultOfPower = baseForPower;

            while (degreeOfPower > 1) {
                resultOfPower = resultOfPower * baseForPower;
                //System.out.println(resultOfPower);
                degreeOfPower--;
            }

            //---------------------------- /powers work


            if (j < 20) {
                newArray[j] = resultOfPower - (2 << (j - 1));
                count++;
            } else {
                System.out.printf("There are overflow on the %d position\n", j);
                newArray[j] = 0;
            }


        }


        //---------------------------- print elements of array
        for (int k = 0; k < arrayLen; k++) {
            System.out.print(newArray[k]);
            if (k != arrayLen - 1) System.out.print(", ");
        }
        //---------------------------- /print elements of array


        double mediane = 0;

        if ((count & 1) == 1) {

                        mediane = newArray[(count >> 1)];

        } else {
            mediane = ((double) newArray[(count >> 1)] + (double) newArray[(count >> 1) - 1]) / 2;
        }

        System.out.println("\nThe median of the array is: " + mediane);

        System.out.println("\nThe end!"); //
    }
}
