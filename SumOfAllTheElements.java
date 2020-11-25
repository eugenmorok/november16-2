import java.util.Scanner;

public class SumOfAllTheElements {

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

        int sum = 0;
        for (int j = 0; j < arrayLen; j++) {
            sum+=newArray[j];
        }

        System.out.println("And your sum of the ");

    }
}
