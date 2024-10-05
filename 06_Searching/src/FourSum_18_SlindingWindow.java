import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_18_SlindingWindow {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n-3; i++) {
            for (int j = i+1; j < n-2; j++) {
                int start = j + 1;
                int end = n-1;

                while (start < end) {
                    long sum = (long) (nums[i]);
                    sum += (long) (nums[j]);
                    sum += (long) (nums[start]);
                    sum += (long) (nums[end]);

                    if ( sum == (long) target) {
                        ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[start],nums[end])));
                        int startVal = nums[start];
                        int endVal = nums[end];

                        start++;
                        end--;

                        while (start < end && nums[start] == startVal) start++;
                        while (start < end && nums[end] == endVal) end--;

                    } else if (sum > (long) target) {
                        end--;
                    } else {
                        start++;
                    }


                }
                j = forward(nums,j);
            }
            i = forward(nums,i);
        }

        return ans;
    }

    public static int forward (int[] nums, int index) {
        int temp = nums[index++];

        while (index < nums.length && nums[index] == temp) {
            index++;
        }

        return index-1;
    }

    public static void main(String[] args) {
        System.out.println(fourSum(new int[] {1,0,-1,0,-2,2},0));
        System.out.println(fourSum(new int[] {-2,-1,-1,1,1,2,2},0));
        System.out.println(fourSum(new int[] {2,2,2,2,2},8));
        System.out.println(fourSum(new int[] {1000000000,1000000000,1000000000,1000000000},-294967296));
        System.out.println(fourSum(new int[] {-4,-3,-2,-1,0,0,1,2,3,4},0));
        System.out.println(fourSum(new int[] {0,0,4,-2,-3,-2,-2,-3},-1));
    }
}
