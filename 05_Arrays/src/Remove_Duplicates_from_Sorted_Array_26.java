public class Remove_Duplicates_from_Sorted_Array_26 {
    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums) {
        int a = 0;
        int b = 0;

        while (b < nums.length) {
            if (nums[a] == nums[b]) {
                b++;
            } else {
                nums[++a] = nums[b];
            }
        }

        return a+1;
    }
}
