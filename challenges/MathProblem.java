package challenges;

public class MathProblem {

    public static void main(String[] args) {
        System.out.println(sum_numbers());
    }

    public static int sum_numbers() {
        int index = 13;
        int sum = 0;
        int k = 0;

        while(k < index) {
            k += 1;
            sum += k;
        }

        return sum;
    }
}
