import java.util.Scanner;

public class f6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Переработан свой ранний модуль из Python
        */

        String line = "7%8B(X*J9&4+4-9@)*%M%p&9G";

        int line_len = line.length();

        int line_upper = 0;

        int line_lower = 0;

        for (int i = 0; i < line_len; i++) {

            if (line.charAt(i) > 64 && line.charAt(i) < 91) {
                line_upper++;
            } else if (line.charAt(i) > 96 && line.charAt(i) < 123) {
                line_lower++;
            }
        }


        int line_special = 0;
        int line_digit = 0;

        String rek1 = "увеличить число символов - " + (12 - line_len);

        String rek2 = "добавить 1 заглавную букву";

        String rek3 = "добавить 1 цифру";

        String rek4 = "добавить 1 спецсимвол";

        String rek5 = "добавить 1 строчную букву";

        String er1 = "Ошибка. Запрещенный спецсимвол";

        String er2 = "Слабый пароль. Рекомендации: ";

        String er0 = "Сильный пароль.";


        String bad_s = "`~$][\"\'\\?.,:;|/";

        boolean isBadSpec = false;


        //----------------------------------------------------- check for bad special
        for (int k = 0; k < line_len; k++) {

            for (int e = 0; e < bad_s.length(); e++) {

                if (line.charAt(k) == bad_s.charAt(e)) {

                    isBadSpec = true;
                    System.out.println(er1);
                    break;

                }
            }
        }

        if (!isBadSpec) {


            //----------------------------------------------------- /check for bad special

            {
                String s = "!@#$%^&*()-+";

                for (int j = 0; j < line_len; j++) {

                    for (int f = 0; f < s.length(); f++) {

                        if (line.charAt(j) == s.charAt(f)) {

                            line_special++;

                        }

                    }

                }


            }
        }


        for (int d = 0; d < line.length(); d++) {

            if (line.charAt(d) > 47 && line.charAt(d) < 58) line_digit++;

        }


        if (line_len > 11 && line_upper > 0 && line_lower > 0 && line_special > 0 && line_digit > 0) {
            System.out.println(er0);
        }
        if (line_len < 12 || line_upper < 1 || line_lower < 1 || line_special < 1 || line_digit < 1) {
            System.out.println(er2);
        }
        if (line_len < 12) {
            System.out.println(rek1);
        }
        if (line_upper < 1) {
            System.out.println(rek2);
        }
        if (line_lower < 1) {
            System.out.println(rek5);
        }
        if (line_special < 1) {
            System.out.println(rek4);
        }
        if (line_digit < 1) {
            System.out.println(rek3);
        }

    }
}





