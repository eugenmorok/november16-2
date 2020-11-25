import java.util.Scanner;

public class BinaryRepresentationOfNumberInTheArrayFor4bit {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr4 = new int[4];

        System.out.print("enter the number here(0...15): ");
        int number = sc.nextInt();

        int count = 3;
        for (int i = 0; i < 4; i++) {

            arr4[count] = (number >> (i)) & 1;
            count--;
        }

        //System.out.println((number >> (i)) & 1);

        //---------------------------- print elements of the array
        for (int j = 0; j < 4; j++) {
            System.out.print(arr4[j]);
            if (j != 4 - 1) System.out.print(", ");
        }
        //---------------------------- /print elements of the array


    }
}
