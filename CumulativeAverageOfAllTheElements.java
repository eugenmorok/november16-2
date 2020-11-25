import java.util.Scanner;

public class CumulativeAverageOfAllTheElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //--------------------------------------------- entering the initials

        System.out.print("Enter the array length here: ");
        int arrayLen = sc.nextInt();

        //--------------------------------------------- /entering the initials

        //--------------------------------------------- manual adding to array

        int[] newArray = new int[arrayLen];
        int i = 0;

        while (i < arrayLen) {
            System.out.printf("Enter the %d element(int): ", i + 1);
            newArray[i] = sc.nextInt();
            i++;
        }

        //--------------------------------------------- /manual adding to array

        double [] finalArray = new double[arrayLen + 1];
        double sum;
        int count = 0;

        for (int k = 0; k < arrayLen; k++) {

            count++;
            sum = 0;

            for (int s = 0; s < k + 1; s++) {

                sum += (double)newArray[s] / (double)count;

            }

            finalArray[k] = sum;

        }

        //---------------------------- print elements of array
        for (int e = 0; e < arrayLen; e++) {
            System.out.print(finalArray[e]);
            if (e != arrayLen - 1) System.out.print(", ");
        }
        //---------------------------- /print elements of array


        System.out.println("\nThe end.");

    }
}
