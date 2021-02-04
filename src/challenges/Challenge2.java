package challenges;

public class Challenge2 {

    public static void main(String[] args) {

        String example1 = "I want a bike.";
        String example2 = "I want a ball.";
        String regExp = "I want a b\\w{3}.";
        if (example1.matches(regExp) && example2.matches(regExp)) {
            System.out.println("RegExp - OK");
        }
    }
}
