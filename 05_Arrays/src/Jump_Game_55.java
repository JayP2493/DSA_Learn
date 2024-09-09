public class Jump_Game_55 {
    public boolean canJump(int[] nums) {
        int goal = nums.length-1;

        for (int i = 1; i < nums.length; i++) {
            int temp = nums.length-1-i;

            if (temp + nums[temp] >= goal) {
                goal = temp;
            }
        }

        return goal == 0;
    }
}
