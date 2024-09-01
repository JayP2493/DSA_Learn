import java.util.Arrays;

public class Shuffle_the_Array_1470 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[] {2,5,1,3,4,7},3)));
        System.out.println(Arrays.toString(shuffle(new int[] {1,2,3,4,4,3,2,1},4)));
        System.out.println(Arrays.toString(shuffle(new int[] {1,1,2,2},2)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ansArr = new int[nums.length];
        int j = 0;

        for (int i = 0; i < n; i++) {
            ansArr[j] = nums[i];
            j++;
            ansArr[j] = nums[i+n];
            j++;
        }

        return ansArr;
    }
}
