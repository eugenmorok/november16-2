import java.util.Scanner;

public class GuessTheConsequenceByTheHumanBrain1 {
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


        //---------------------------- main

        int[] level3Arr = new int[arrLen];
        int[] level2Arr = new int[arrLen];
        int level3FirstElement = 4;
        int level2FirstElement = 4;
        int level1FirstElement = 8;

        level2Arr[0] = level2FirstElement;
        level3Arr[0] = level3FirstElement;

        for (int i = 1; i < arrLen; i++) {


            level2Arr[i] = level1FirstElement + level2FirstElement;
            level2FirstElement = level2Arr[i];

            if ((level3Arr[i - 1] + level2Arr[i]) > 0) {

                level3Arr[i] = level3Arr[i - 1] + level2Arr[i];
            } else level3Arr[i] = 0;

        }

        //---------------------------- /main


        //---------------------------- print elements of array
        for (int j = 0; j < arrLen; j++) {
            System.out.print(level3Arr[j]);
            if (j != arrLen - 1) System.out.print(", ");
        }
        //---------------------------- /print elements of array


        System.out.println("\nThe end!");

    }
}
