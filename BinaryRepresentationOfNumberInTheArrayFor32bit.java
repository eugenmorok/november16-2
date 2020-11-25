import java.util.Scanner;

public class BinaryRepresentationOfNumberInTheArrayFor32bit {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr4 = new int[32];

        System.out.print("enter the number here(0...(2^31 - 1)): ");
        int number = sc.nextInt();

        int count = 31;
        for (int i = 0; i < 32; i++) {

            arr4[count] = (number >> (i)) & 1;
            count--;
        }

        //System.out.println((number >> (i)) & 1);

        //---------------------------- print elements of the array
        for (int j = 0; j < 32; j++) {
            System.out.print(arr4[j]);
            if (j != 31) System.out.print(", ");
        }
        //---------------------------- /print elements of the array


    }
}
