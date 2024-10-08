public class Product_of_Array_Except_Self_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        ans[0]++;

        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i-1]*nums[i-1];
        }

        int rp = 1;

        for (int i = 0; i < nums.length; i++) {
            ans[ans.length-1-i] *= rp;
            rp *= nums[nums.length-1-i];
        }

        return ans;
    }
}
