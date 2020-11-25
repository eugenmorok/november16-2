import java.util.Scanner;

public class SearchSecondMin {

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

        //--------------------------------------------- check for aquas to all

        int arraySum = 0;
        boolean isAqual = true;

        for (int k = 0; k < arrayLen; k++) arraySum += newArray[k];

        arraySum /= arrayLen;

        //--------------------------------------------- /check for aquas to all

        //--------------------------------------------- search the min element

        int j = 0;
        int minValue = newArray[0];

        for (; j < arrayLen; j++) {
            if (arraySum != newArray[j]) isAqual = false;
            if (newArray[j] < minValue) minValue = newArray[j];
        }

        //--------------------------------------------- /search the min element

        //--------------------------------------------- /searching the length of the final array

        int lenFinalArray = 0;

        if (!isAqual) {
            for (int s = 0; s < arrayLen; s++) if (newArray[s] != minValue) lenFinalArray++;
        }

        //--------------------------------------------- creating final array to find the second value

        //System.out.println(lenFinalArray);

        int[] finalArray = new int[lenFinalArray];

        int count = 0;
        if (!isAqual) {

            for (int x = 0; x < arrayLen; x++) {  // adding the need elements

                if (newArray[x] == minValue) continue;

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


        //--------------------------------------------- search the min element
        int minSecondValue = 0;
        int y = 0;

        if (!isAqual) {

            minSecondValue = finalArray[0];

            for (; y < lenFinalArray; y++) {

                if (newArray[y] < minSecondValue) minSecondValue = finalArray[y];
                //System.out.println(minSecondValue);
            }
        }

        //--------------------------------------------- /search the min element

        if (!isAqual) {
            System.out.print("\nThe second minimal value of the array is: " + minSecondValue + " and " +
                    "the value index is: ");
            //--------------------------------------------- searching index of the second element

            for (int z = 0; z < arrayLen; z++) {

                if (newArray[z] == minSecondValue) System.out.print("[" + (z + 1) + "] ");

            }

            //--------------------------------------------- searching index of the second element


        } else System.out.println("There are NO minimal element, ");

        System.out.println("The end.");
    }
}