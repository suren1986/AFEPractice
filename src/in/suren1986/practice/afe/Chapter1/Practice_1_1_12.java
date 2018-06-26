package in.suren1986.practice.afe.Chapter1;

public class Practice_1_1_12 {
    public static void main(String args[]) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        // a = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        /**
         * a[0] = a[a[0]] = a[9] = 0;
         * a[1] = a[a[1]] = a[8] = 1;
         * a[2] = a[a[2]] = a[7] = 2;
         * a[3] = a[a[3]] = a[6] = 3;
         * a[4] = a[a[4]] = a[5] = 4;
         * a[5] = a[a[5]] = a[4] = 4;
         * a[6] = a[a[6]] = a[3] = 3;
         * a[7] = a[a[7]] = a[2] = 2;
         * a[8] = a[a[8]] = a[1] = 1;
         * a[9] = a[a[9]] = a[0] = 0;
         *
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            /**
             * 要不要这么无聊..
             * 不应该 System.out.println(a[i]); 么
             */
        }
    }
}
