import java.util.Scanner;

public class GuessTheConsequenceByTheHumanBrain11 {
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
        int top = 1;
        int bottom = 1;

        finalArray[0] = 1;

        int i = 1;

        while (i < arrLen) {

            top = (i+1) * (i+1);
            //System.out.println("top --" + top);
            bottom += 2;
            //System.out.println("bot--" + bottom);
            finalArray[i] = (double) top / (double) bottom;
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
