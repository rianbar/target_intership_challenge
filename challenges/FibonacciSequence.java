package challenges;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write the number you want to check in the fibonacci: ");
        int number = scan.nextInt();
        System.out.println("your number " + fibonacciSolution(number) + " to the sequence!");
        System.out.println(fibonacciSolution(number));
    }

    public static String fibonacciSolution(int value) {
        int cur = 0;
        int prev = 0;

        for (int i = 1; cur < value; i++) {
            if (i == 1) {
                cur = 1;
                prev = 0;
            } else {
                cur += prev;
                prev = cur - prev;
            }
        }

       return cur == value ? "belongs" : "doesn't belongs";
    }
}
