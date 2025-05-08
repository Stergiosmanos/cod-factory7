package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o");                      // θα μας δώσει το πρώτο o
        int positionOfSecondo = cf.indexOf("o", 2); // 2o
        int lastPositionOfo = cf.lastIndexOf("o");

        String cf2 = cf.substring(0);    // θα φέρει το ίδιο το cf.
        String slice = cf.substring(1, 3);        // αποτέλεσμα: od
        String cf3 = cf.substring(3,14);          // αποτέλεσμα: ing Factory

        System.out.print(cf3);
    }
}
