import java.util.Scanner;

public class TheConsequenceByTheFormula10 {

    /*

Пользователь с клавиатуры вводит размер массива, который нужно полностью заполнить элементами ряда,
начиная с первого.
Если пользователь вводит 0 или отрицательное значения для длины массива, выдать сообщения о недопустимости такого
значения и попросить его ввести значение ещё раз. И так пока он не введёт допустимое значение (
базовая защита от "дурака").

Для int-овых последовательностей:
Если происходит переполнение при вычислении значения члена ряда, заполнить соответствующие ячейки массива 0 при
положительном переполнении, и -1 для отрицательного переполнения. Уведомить пользователя соответствующим
сообщением (user-friendly).

Каждый член последовательности задан формулой, зависящей от номера последовательности:
например, если a(n) = 3 * n + 4, т
огда первый член последовательности равен a(1) = 3 * 1 + 4 = 7, a(2) = 3 * 2 + 4 = 10 и т. д.

1) a(n) = 5. Уровень сложности 1. Работать в int-ах.
2) a(n) = (n^2 - 9 ) / n.  n^2 означает n в степени 2, то есть в квадрате. Уровень сложности 1.Работать в double.
3) a(n) = (2^n + 1) / (10 - n^2). Уровень сложности 2. Работать в double.
4) a(n) = (-1)^n / (9 * n - 10). Уровень сложности 2. Работать в double.
5) a(n) = [(-1)^(n+1) * (n + 1)] / n ! Здесь в квадратных скобках числитель дроби.
n! - это читается как "н факториал". Так обозначается произведение чисел натурального ряда от 1 до n.
n! = 1 * 2 * 3 * ... * (n -1) * n. Например, 0! = 1
(так получается из комбинаторики, откуда и возникло понятие факториала),
1! = 1, 2! = 2, 3! = 6, 4! = 24, 5! = 1 * 2 * 3 * 4 * 5 = 120 и т. д. Уровень сложности 4.
Числитель и знаменатель отдельно считать в int-ах, значение самой дроби - в double.
6) a(n) = 2^n + (-2)^n. . Уровень сложности 3. Работать в int-ах.
7) a(n) = (-1)^n + (-1)^(n + 1).  Уровень сложности 3. Работать в int-ах.
8) a(n) = 2^n^2. Два в степени n в квадрате. Сначала, по правилам, возводится n в квадрат, а потом два в
получившуюся степень. Уровень сложности 4. Работать в int-ах.
9) a(n) = 2^2^n / 2^(2 * n). В числителе: два в степени 2 в степени n. Сначала, по правилам, возводится 2 в степень n,
а потом первая двойка в получившуюся степень второй двойки. В знаменателе: два возводится в степень произведения 2 и n.
  Уровень сложности 5. Какой лучше тип данных здесь выбирать самим.
10) a(n) = n^(-1)^n. n возводится в степень, равную -1 в степени n.  Уровень сложности 3. Работать в int-ах.
11) a(n) = n^2 + (-1)^n * n/2.  Уровень сложности 3. Работать в int-ах, то есть здесь n/2 означает целочисленное
деление с отбрасыванием остатка.

     */

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

        int n = 1;

        int elementForAdding = 0;

        int c = 0; // for check to overflow

        for (int i = 0; i < arrLen; i++) {


            //---------------------------- powers work

            int baseForPower = -1;
            int degreeOfPower = n;
            int resultOfPower = baseForPower;


            int baseForPower2 = n;
            int degreeOfPower2 = resultOfPower;
            int resultOfPower2 = baseForPower;


            while (degreeOfPower > 1) {
                resultOfPower = resultOfPower * baseForPower;
                System.out.println("resultOfPower; " + resultOfPower);
                degreeOfPower--;


            //---------------------------- /powers work


            //---------------------------- powers work




            if (resultOfPower > 0) {

                while (degreeOfPower2 > 1) {
                    resultOfPower2 = resultOfPower2 * baseForPower2;
                    System.out.println("resultOfPower2^+; " + resultOfPower2);
                    degreeOfPower2--;
                }

            } else if (resultOfPower < 0) {

                degreeOfPower2 *= -1;

                while (degreeOfPower2 > 1) {
                    resultOfPower2 = resultOfPower2 * baseForPower2;
                    System.out.println("resultOfPower2^-; " + resultOfPower2);
                    degreeOfPower2--;
                }

                resultOfPower2 = 1 / resultOfPower2;

            } else {
                resultOfPower2 = 1;
                System.out.println("resultOfPower2^0 " + resultOfPower2);
            }}


            //---------------------------- /powers work


            //---------------------------------- check to overflow

            c = resultOfPower2;

            if (c < 2147483647 && c > 0) {
                newArray[i] = c;
            } else {
                newArray[i] = 0;
            }

            //---------------------------------- /check to overflow

            //newArray[i] = (2 << (n - 1)) + minus2N;

            n++;

        }
        //---------------------------- /adding new elements to array

        //System.out.println("\n");

        //---------------------------- print elements of array


        int v = 0;
        for (int j = 0; j < arrLen; j++) {

            v = newArray[j];

            System.out.print(v);
            if (j != arrLen - 1) System.out.print("; ");


        }
        //---------------------------- /print elements of array


        System.out.println("\nThe end!");
    }
}


