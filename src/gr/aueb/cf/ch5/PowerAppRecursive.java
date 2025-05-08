package gr.aueb.cf.ch5;

public class PowerAppRecursive {

    public static void main(String[] args) {

        for (int i = 0, n = 3; i <= n; i++) {
            System.out.println(power((int)i, n));
        }
    }

    /**
     * Recursive version of Power App.
     *
     * @param a the base.
     * @param n the power.
     * @return the base raised to the power.
     */
    public static long power(int a, int n) {
//        if (n == 0) return 1;
//        return power(a, n - 1) * a;

        return (n == 0) ? 1L : power(a, n - 1) * a;
    }

}
