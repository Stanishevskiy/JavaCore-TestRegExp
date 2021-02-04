package challenges;

public class Challenge4 {

    public static void main(String[] args) {

        String example = "Replace all blanks with underscores.";
        String resultStr = example.replaceAll("\\s", "_");
        System.out.println(resultStr);
    }
}
