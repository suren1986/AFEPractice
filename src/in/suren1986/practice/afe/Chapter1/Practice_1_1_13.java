package in.suren1986.practice.afe.Chapter1;

public class Practice_1_1_13 {
    public static void main(String args[]) {
        String[][] target = {
                {"a", "b", "c", "d"},
                {"e", "f", "g", "h"},
                {"i", "j", "k", "l"},
        };

        int rowCount = target.length;
        int columnCount = target[0].length;

        for (int column = 0; column < columnCount; column++) {
            for (int row = 0; row < rowCount; row++) {
                System.out.print(target[row][column] + "\t");
            }
            System.out.print("\n");
        }
    }
}
