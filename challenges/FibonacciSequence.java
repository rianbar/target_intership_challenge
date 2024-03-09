package challenges;

public class FibonacciSequence {

    public static void main(String[] args) {
        System.out.println(fibonacciSolution(5));
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

       return cur == value ? "pertence" : "não pertence";
    }
}
