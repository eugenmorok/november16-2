import java.util.Scanner;

public class ScopeLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start number here: ");
        int start = sc.nextInt();

        System.out.print("Enter the end number here: ");
        int end = sc.nextInt();

        int arrLen = 50;

        int[] newArray = new int[arrLen];


        int n25 = 0;
        int n5 = 2;
        int n1 = 4;
        int n3 = 3;
        int baseForPower = 1;

        while (n25 < 50) {

            newArray[n25] = 25;
            n25 += 8;

        }

        while (n5 < 50) {

            newArray[n5] = 5;
            n5 += 4;
        }

        while (n1 < 50) {

            newArray[1] = 1;
            newArray[n1] = 1;
            n1 += 8;
        }

        while (n3 < 50) {

            baseForPower *= 3;

            if (baseForPower != 1162261467) {
                newArray[n3] = baseForPower;
                n3 += 2;
            } else {
                System.out.println("There are overflow at the " + n3 + " position of the array!");
                newArray[n3] = 0;
                baseForPower = 1;
                n3 += 2;
            }


        }

       /*
        int count = 0;
        //---------------------------- print elements of array
        for (int j = 0; j < arrLen; j++) {
            System.out.print(newArray[j]);
            count++;
            if (j != arrLen - 1) System.out.print(", ");
        }
        //---------------------------- /print elements of array
        System.out.println("\nCount of the elements is: " + count);
        */


        //---------------------------- print elements of array

        System.out.println("The your results are on the bottom:");


        int count = 0;

        for (int e = start; e < end + 1; e++) {

            for (int s = 0; s < arrLen; s++) {

                if (newArray[s] == e) {
                    count++;
                    System.out.print(newArray[s] + "[" + s + "], ");

                }

            }


        }
        System.out.println("\nThere are " + count + " matches here.\nThe end of the program!");
        //---------------------------- /print elements of array

    }


}
