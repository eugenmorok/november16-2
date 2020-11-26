
public class jkEasyPasswordCheckerToCorrect1 {

    public static boolean jkCheckMyPassword(String passwordToCheck) {


        /*
        Переработан свой ранний код из Python


        Пароль считается надежным, если его длина составляет не менее 12 символов, при этом он должен содержать хотя
        бы одну заглавную букву, хотя бы одну строчную букву, хотя бы одну цифру и хотя бы один спецсимвол.

        Запрещены спецсимволы: `~$]["'\?.,:;|/
        */

        boolean isPasswordCorrect = false;

        String line = passwordToCheck;

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

        String rek1 = "increase the number of characters by " + (12 - line_len);

        String rek2 = "add 1 capital letter";

        String rek3 = "add 1 digit";

        String rek4 = "add 1 special character";

        String rek5 = "add 1 lowercase letter";

        String er1 = "There are forbidden special character";

        String er2 = "There are weak password. Recommendations: ";

        String er0 = "Strong password here.";


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
            isPasswordCorrect = true;
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

        return isPasswordCorrect;

    }
}





