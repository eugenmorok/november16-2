import java.util.Scanner;

public class TheConsequenceByTheRecurrenceRelation2 {
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
        double[] newArray = new double[arrLen];

        double n = 1;
        newArray[0] = 1;

        for (int i = 1; i < arrLen; i++) {

            n = (n * 0.1) + 10;
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
