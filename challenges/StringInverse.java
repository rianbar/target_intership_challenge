package challenges;

import java.util.ArrayList;
import java.util.List;

public class StringInverse {

    public static void main(String[] args) {
        System.out.println(reverseString("carro de controle remoto"));
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
