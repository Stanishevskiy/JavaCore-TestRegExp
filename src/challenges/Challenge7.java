package challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge7 {

    public static void main(String[] args) {

        String example = "abcd.135uvqz.7tzik.999";
        String regExpGroup = "\\w+.(\\d+)";
        Pattern pattern = Pattern.compile(regExpGroup);
        Matcher matcher = pattern.matcher(example);
        int i = 1;
        while (matcher.find()) {
            System.out.println("Find " + i + " occurrence: " + matcher.group(1));
            i++;
        }
    }
}
