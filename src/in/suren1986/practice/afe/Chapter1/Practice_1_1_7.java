package in.suren1986.practice.afe.Chapter1;

import algs4.cs.princeton.edu.StdOut;

public class Practice_1_1_7 {
    public static void main(String args[]) {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);
        /**
         * t = 9.0
         * 9 - 9 / 9 = 8 > .001, t = 5.0;
         * 5 - 9 / 5 = 3.2 > .001, t = (9 / 5 + 5) / 2 = (1.8 + 5) / 2 = 3.4
         * 3.4 -
         */
    }
}
