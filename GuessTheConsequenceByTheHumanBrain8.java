import java.util.Scanner;

public class GuessTheConsequenceByTheHumanBrain8 {
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

        double topLeft = 1;
        double topRight = 7;

        double bottomLeft = 3;
        double bottomRight = 5;

        finalArray[0] = (topLeft * topRight) / (bottomLeft * bottomRight);

        int i = 1;

        while (i < arrLen) {

           topLeft++;
           topRight++;

           bottomLeft++;
           bottomRight++;

           finalArray[i] = (topLeft * topRight) / (bottomLeft * bottomRight);

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
