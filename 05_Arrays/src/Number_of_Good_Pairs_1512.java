public class Number_of_Good_Pairs_1512 {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[] {1,2,3,1,1,3}));
        System.out.println(numIdenticalPairs(new int[] {1,1,1,1}));
        System.out.println(numIdenticalPairs(new int[] {1,2,3}));
    }
    public static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] arr = new int[102];

        for (int num : nums) {
            arr[num]++;
        }

        for (int i : arr) {
            if (i > 0) {
                ans += ((i * (i-1))/2);
            }
        }

        return ans;
    }

    public static int numIdenticalPairs2(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
