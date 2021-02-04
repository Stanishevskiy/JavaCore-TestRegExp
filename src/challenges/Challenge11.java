package challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge11 {

    public static void main(String[] args) {

        String example1 = "11111";
        String example2 = "11111-1111";
        String regExp = "^\\d{5}(-\\d{4})?$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher1 = pattern.matcher(example1);
        while (matcher1.find()) {
            System.out.println("RegExp - OK");
        }
        Matcher matcher2 = pattern.matcher(example2);
        while (matcher2.find()) {
            System.out.println("RegExp - OK");
        }
    }
}
