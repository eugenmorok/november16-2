import java.util.Scanner;

public class SquareCongruentMethodOfRandomNumbersGenerationWithParsing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start element of the array: ");
        int x0 = sc.nextInt();

        System.out.print("Enter the k-multiplier: ");
        int k = sc.nextInt();

        System.out.print("Enter the b-addendum: ");
        int b = sc.nextInt();

        System.out.print("Enter the length of the array: ");
        int arrLen = sc.nextInt();

        int[] newArray = new int[arrLen];

        newArray[0] = x0;

        int i = 1;

        while (i < arrLen) {

            newArray[i] = (newArray[i - 1] * newArray[i - 1] * k + b) % 100;
            i++;

        }

        //---------------------------- print elements of array
        for (int j = 0; j < arrLen; j++) {
            System.out.print(newArray[j]);
            if (j != arrLen - 1) System.out.print(", ");
        }
        //---------------------------- /print elements of array

        System.out.println("\nThe end!");

    }
}
