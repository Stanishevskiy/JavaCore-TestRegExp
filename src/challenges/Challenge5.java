package challenges;

public class Challenge5 {

    public static void main(String[] args) {

        String example = "aaabccccccccdddefffg";
//        String regExp = "[a-g]+";
        String regExp = "^a{3}bc{8}d{3}ef{3}g$";
        if (example.matches(regExp)) {
            System.out.println("RegExp - OK");
        }
    }
}
