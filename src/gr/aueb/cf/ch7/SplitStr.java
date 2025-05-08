package gr.aueb.cf.ch7;

public class SplitStr {

    public static void main(String[] args) {
        String s = "Athens uni    of Econ   and Business";

        String[] tokens = s.split("\\s+");

        for (String token : tokens) {
            System.out.print(token + " ");
        }
        System.out.println();

        System.out.println(tokens.length); // 6

        System.out.println(tokens[5]);    // Business
    }
}
