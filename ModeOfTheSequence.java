import java.util.Scanner;

public class ModeOfTheSequence {

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
        int firstnumber = 0;
        int count = 0;


        for (int j = 0; j < arrayLen; j++) {


            for (int k = j + 1; k < arrayLen; k++) {

                if (newArray[j] == newArray[k]) {
                    count++;
                }

                if (count > firstnumber) {

                    start = newArray[j];
                    firstnumber = count;

                }

            }

        }
        //System.out.println(start);
        System.out.println("the count = " + count);

        if (count != 0 && start == 0) System.out.println("the mode is 0");
        else if (start == 0) System.out.println("the mode is undefined");
        else System.out.println("the mode is " + start);

        System.out.println("the end!"); // TODO: to extend to the multimodal variants

    }
}
