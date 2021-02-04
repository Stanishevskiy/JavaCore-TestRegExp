package challenges;

public class Challenge1 {

    public static void main(String[] args) {

        String example = "I want a bike.";
        String rexExp = "I want a bike.";
        if (example.matches(rexExp)) {
            System.out.println("RegExp - OK");
        }
    }
}
