import java.util.Scanner;

public class UsualCheckPassword {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean arePasswordsEquals = false;
        String enteredPassword = "";
        String repeatPassword1 = "";
        String repeatPassword2 = "";
        boolean areEqualsLenOfPass = false;

        do {
            System.out.print("Plese enter your password string here: ");
            enteredPassword = sc.nextLine();
        }
        while (!(jkEasyPasswordCheckerToCorrect1.jkCheckMyPassword(enteredPassword)));


        do {
            System.out.print("Please repeat your entered password: ");
            repeatPassword1 = sc.nextLine();

            System.out.print("Please repeat your entered password again: ");
            repeatPassword2 = sc.nextLine();

            if (enteredPassword.length() == repeatPassword1.length() &&
                    enteredPassword.length() == repeatPassword2.length()) {

                areEqualsLenOfPass = true;

                for (int i = 0; i < enteredPassword.length(); i++) {

                    arePasswordsEquals = true;

                    if (enteredPassword.charAt(i) != repeatPassword1.charAt(i) ||
                            enteredPassword.charAt(i) != repeatPassword2.charAt(i)) {

                        arePasswordsEquals = false;

                    }

                }

            }

        }

        while (!(areEqualsLenOfPass && arePasswordsEquals));

        sc.close();

        System.out.println("Congratulations, you did everything right\n The end of the program");

    }
}
