import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_18 {
    public static List<List<Integer>> fourSum (int[] nums,int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        if (nums.length < 4) {
            return ans;
        } else {
            for (int i = 0; i < nums.length-3; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                for (int j = i+1; j < nums.length-2; j++) {
                    for (int k = j+1; k < nums.length-1; k++) {
                        int sum = nums[i] + nums[j] + nums[k];
                        int target2 = target-sum;

                        int temp = bSearch(nums,target2,j+1,nums.length-1);

                        if (temp+sum == target) {
                            List<Integer> tempAns = new ArrayList<>();
                            tempAns.add(nums[i]);
                            tempAns.add(nums[j]);
                            tempAns.add(nums[k]);
                            tempAns.add(temp);
                            ans.add(tempAns);
                        }

                        while (nums[k] == nums[k-1] && k < nums.length-1) {
                            k++;
                        }
                    }
                    while (nums[j] == nums[j-1] && j < nums.length-1) {
                        j++;
                    }
                }
            }
            return ans;
        }
    }

    public static int bSearch (int[] arr, int target, int start, int end) {
        while (start < end) {
            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                end = start;
            } else {
                start = end + 1;
            }
        }

        return arr[end];
    }

    public static void main(String[] args) {
        System.out.println(fourSum(new int[] {1,0,-1,0,-2,2},0));
        System.out.println(fourSum(new int[] {2,2,2,2,2},8));
    }
}
