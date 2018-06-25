package in.suren1986.practice.afe.Chapter1;

import algs4.cs.princeton.edu.StdIn;
import algs4.cs.princeton.edu.StdOut;

public class Practice_1_1_3 {
    public static void main(String args[]) {
        int[] input = new int[3];

        int index = 0;
        do {
            input[index] = StdIn.readInt();
        } while (++index < input.length);
        
        StdOut.println(input[0] == input[1] && input[1] == input[2]);
    }
}
