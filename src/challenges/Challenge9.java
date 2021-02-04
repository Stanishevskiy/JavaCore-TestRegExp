package challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge9 {

    public static void main(String[] args) {

        String example = "abcd.135\tuvqz.7\ttzik.999\n";
        String regExpGroup = "\\w+.(\\d+)\\s";
        Pattern pattern = Pattern.compile(regExpGroup);
        Matcher matcher = pattern.matcher(example);
        int i = 1;
        while (matcher.find()) {
            System.out.println("Find " + i + " occurrence: " + matcher.group(1)
                    + ", matcher start from: " + matcher.start(1) + " & matcher end from: " + (matcher.end(1) - 1));
            i++;
        }
    }
}
