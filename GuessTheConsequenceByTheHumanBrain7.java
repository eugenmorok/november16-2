import java.util.Scanner;

public class GuessTheConsequenceByTheHumanBrain7 {
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

        double top = -1;

        double bottom = 2;

        finalArray[0] = top / bottom;

        int i = 1;

        while (i < arrLen) {

            if (top < 0) top = -1 * top + 1;
            else top = -1 * top - 1;

            //System.out.println("top==" + top);
            bottom++;

            finalArray[i] = top / bottom;

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
