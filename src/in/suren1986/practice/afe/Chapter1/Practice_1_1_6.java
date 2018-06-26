package in.suren1986.practice.afe.Chapter1;

import algs4.cs.princeton.edu.StdOut;

public class Practice_1_1_6 {
    public static void main(String args[]) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
        /**
         * i = 0: print 0; f = 1, g = 0;
         * i = 1; print 1; f = 1, g = 1;
         * i = 2; print 1; f = 2, g = 1;
         * i = 3; print 2; f = 3, g = 2;
         * i = 4; print 3; f = 5, g = 3;
         * i = 5; print 5; f = 8, g = 5;
         * i = 6; print 8; f = 13, g = 8;
         */
    }
}
