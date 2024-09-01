import java.util.Arrays;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number_1365 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] {8,1,2,2,3})));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ansArr = new int[nums.length];

        for (int i = 0; i < nums.length - 1; i++) {
            int a = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    a++;
                }
            }
            ansArr[i] = a;
        }

        return ansArr;
    }
}
