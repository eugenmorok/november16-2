public class f4 {
    public static void main(String[] args) {

        //int minus = -2147483648;
        //int a = minus - 1;


        int num = 2147483647;
        if (num - 1 >= 2147483647) System.out.println("there are overflow: " + num);
        else System.out.println("there are all right: " + num);


        if (num * num != -1) System.out.println("not overflow here");

        byte x = 127;
        byte y = 127;

        System.out.println(      (byte)(x + y)         );


    }
}
