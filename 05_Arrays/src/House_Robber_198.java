public class House_Robber_198 {
    public static void main(String[] args) {
        System.out.println(rob(new int[] {1,2,3,1}));
        System.out.println(rob(new int[] {2,7,9,3,1}));
    }
    public static int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;

        for (int n : nums) {
            int temp = Math.max(n+rob1,rob2);
            rob1 = rob2;
            rob2 = temp;
        }

        return rob2;
    }
}
