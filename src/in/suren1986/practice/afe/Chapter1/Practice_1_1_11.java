package in.suren1986.practice.afe.Chapter1;

public class Practice_1_1_11 {
    public static void main(String args[]) {
        boolean[][] target = {
                {true, false, true, false},
                {true, true, false, false},
                {false, false, true, true,},
        };

        System.out.print("\t");
        for (int index = 0; index < target[0].length; index++) {
            System.out.print(index + "\t");
        }
        System.out.println("\n");

        for (int row = 0; row < target.length; row++) {
            System.out.print(row + "\t");
            for (int column = 0; column < target[row].length; column++) {
                if (target[row][column]) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }

            System.out.println("\n");
        }
    }
}
