import java.util.Scanner;

public class SearchSecondMax {

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

        //--------------------------------------------- check for aquals to all

        int arraySum = 0;
        boolean isAqual = true;

        for (int k = 0; k < arrayLen; k++) arraySum += newArray[k];

        arraySum /= arrayLen;

        //--------------------------------------------- /check for aquals to all

        //--------------------------------------------- search the max element

        int j = 0;
        int maxValue = newArray[0];

        for (; j < arrayLen; j++) {
            if (arraySum != newArray[j]) isAqual = false;
            if (newArray[j] > maxValue) maxValue = newArray[j];
        }

        //--------------------------------------------- /search the min element

        //--------------------------------------------- /searching the length of the final array

        int lenFinalArray = 0;

        if (!isAqual) {
            for (int s = 0; s < arrayLen; s++) if (newArray[s] != maxValue) lenFinalArray++;
        }

        //--------------------------------------------- creating final array to find the second value

        //System.out.println(lenFinalArray);

        int[] finalArray = new int[lenFinalArray];

        int count = 0;
        if (!isAqual) {

            for (int x = 0; x < arrayLen; x++) {  // adding the need elements

                if (newArray[x] == maxValue) continue;

                finalArray[count] = newArray[x];
                count++;

            }
        }

        //--------------------------------------------- /creating final array to find the second value

        /*
        //---------------------------- print elements of array
        for (int m = 0; m < lenFinalArray; m++) {
            System.out.print(finalArray[m]);
            if (m != lenFinalArray - 1) System.out.print(", ");
        }
        //---------------------------- /print elements of array
        */


        //--------------------------------------------- search the max element
        int maxSecondValue = 0;
        int y = 0;

        if (!isAqual) {

            maxSecondValue = finalArray[0];

            for (; y < lenFinalArray; y++) {

                if (newArray[y] > maxSecondValue) maxSecondValue = finalArray[y];
                //System.out.println(minSecondValue);
            }
        }

        //--------------------------------------------- /search the max element


        if (!isAqual) {
            System.out.print("\nThe second maximal value of the array is: " + maxSecondValue + " and " +
                    "the value index is: ");
            //--------------------------------------------- searching index of the second element

            for (int z = 0; z < arrayLen; z++) {

                if (newArray[z] == maxSecondValue) System.out.print("[" + (z + 1) + "] ");

            }

            //--------------------------------------------- searching index of the second element


        } else System.out.println("There are NO maximal element, ");

        System.out.println("The end.");
    }
}