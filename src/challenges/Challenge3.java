package challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge3 {

    public static void main(String[] args) {

        String example1 = "I want a bike.";
        String example2 = "I want a ball.";
        String regExp = "I want a b\\w{3}.";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher1 = pattern.matcher(example1);
        Matcher matcher2 = pattern.matcher(example2);
        if (matcher1.find() && matcher2.find()) {
            System.out.println("RegExp - OK");
        }
    }
}
