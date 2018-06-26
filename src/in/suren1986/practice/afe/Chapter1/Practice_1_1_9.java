package in.suren1986.practice.afe.Chapter1;

public class Practice_1_1_9 {
    public static void main(String args[]) {
        int target = 4;
        System.out.println(Integer.toBinaryString(target));

        String result = "";
        for (int n = target; n > 0; n /= 2) {
            result = (n % 2) + result;
        }
        System.out.println(result);
    }
}
