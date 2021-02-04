package challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge10 {

    public static void main(String[] args) {

        String example = "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x, y}, {6, 34}, {11, 12}";
        String regExpGroup = "\\{(\\d+, \\d+)\\}";
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
