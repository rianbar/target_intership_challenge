package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringInverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write the word you want to reverse: ");
        String word = scan.next();
        System.out.println("you reversed word is: " + reverseString(word));
    }

    public static String reverseString(String name) {
        List<String> reverseList = new ArrayList<>();
        String reverseName = "";
        for (int i = name.length() - 1; i > 0; --i) {
            reverseList.add(String.valueOf(name.charAt(i)));
        }

        reverseList.add(String.valueOf(name.charAt(0)));
        reverseName = String.join("", reverseList);
        return reverseName;
    }
}
