package gr.aueb.cf.ch8;

public class NullPointerExceptionApp {

    public static void main(String[] args) {
        String s = "Athens";

        if (s!= null && s.equals("Athens")) {
            System.out.println("equals");
        } else {
            System.out.println("NOT equals");
        }

    }
}
