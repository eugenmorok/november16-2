import java.util.Scanner;

public class AverageOfAllTheElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array length here: ");
        int arrayLen = sc.nextInt();

        int[] newArray = new int[arrayLen];
        int i = 0;

        while (i < arrayLen) {
            System.out.printf("Enter the %d element(int): ", i + 1);
            newArray[i] = sc.nextInt();
            i++;
        }

        int start = 0;

        for (int j = 0; j < arrayLen; j++) {
            start+= newArray[j];
        }

        System.out.println("And your result is: ");
        System.out.println((double)start / (double)arrayLen);


            System.out.println("the end!"); //
    }
}
