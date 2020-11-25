import java.util.Scanner;

public class TheConsequenceByTheRecurrenceRelation9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //---------------------------- pass check to length
        int arrLen = 0;
        boolean isPassCorrect = false;

        while (!isPassCorrect) {
            System.out.print("Enter array length: ");
            arrLen = sc.nextInt();
            if (arrLen > 0) isPassCorrect = true;
            else System.out.print("You array length is incorrect, try again. ");
        }
        //---------------------------- /pass check to length


        //---------------------------- adding new elements to array
        int[] newArray = new int[arrLen];

        int n = 0;
        int m = 0;
        int k = 0;
        int s = 0;
        int x = 0;
        int y = 0;

        switch (arrLen) {

            case 1:
                newArray[0] = 1;
                break;
            case 2:
                newArray[0] = 1;
                newArray[1] = 2;
                break;
            case 3:
                newArray[0] = 1;
                newArray[1] = 2;
                newArray[2] = 4;
                break;
            case 4:
                newArray[0] = 1;
                newArray[1] = 2;
                newArray[2] = 4;
                newArray[3] = 8;
                break;


        }


        if (arrLen > 4) {

            newArray[0] = 1;
            newArray[1] = 2;
            newArray[2] = 4;
            newArray[3] = 8;


            for (int i = 4; i < arrLen; i++) {

                n++;


                newArray[n + 3] = newArray[n + 2] + newArray[n + 1] - newArray[n] - newArray[n - 1];


            }
        }


        //---------------------------- /adding new elements to array

        //---------------------------- print elements of array



        int q = 7; // TODO: to complete the checker in tomorrow
        for (; q < arrLen; q = q + 6) {

            System.out.print(newArray[q+1] + ";");

        }

        System.out.println("\n");


        for (int j = 0; j < arrLen; j++) {

            m = newArray[j];


            System.out.print(m);

            if (j != arrLen - 1) System.out.print(", ");

        }
        //---------------------------- /print elements of array

        System.out.println("\nThe end!" + s + ";" + k);

    }

}

