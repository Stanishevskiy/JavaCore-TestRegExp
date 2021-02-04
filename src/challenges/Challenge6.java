package challenges;

public class Challenge6 {

    public static void main(String[] args) {

        String example1 = "abcd.135";
        String example2 = "kjisl.22";
        String example3 = "f5.12a";
        String regExp = "^\\w+?.\\d+?$";
        if (example1.matches(regExp)) {
            System.out.println("RegExp for example1 - OK");
        }
        if (example2.matches(regExp)) {
            System.out.println("RegExp for example2 - OK");
        }
        if (example3.matches(regExp)) {
            System.out.println("RegExp for example3 - OK");
        }
    }
}
