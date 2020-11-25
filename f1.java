public class f1 {
    public static void main(String[] args) {


        long baseForPower = 3;
        long degreeOfPower = 9;

        long resultOfPower = baseForPower;

        while (degreeOfPower > 1) {
            resultOfPower = resultOfPower * baseForPower;
            System.out.println(resultOfPower);
            degreeOfPower--;
        }
    }
}