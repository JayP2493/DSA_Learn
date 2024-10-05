import java.util.*;

public class FourSum_18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n-3; i++) {
            for (int j = i+1; j < n-2; j++) {
                for (int k = j+1; k < n-1; k++) {

                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];

                    long target2 = target - sum;

                    int temp = bSearch(nums,target2, k+1,n-1);

                    if (temp >= 0) {
                        ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[temp])));
                        Collections.sort(ans.get(ans.size()-1));
                    }

                    k = forward (nums,k);
                }
                j = forward (nums,j);
            }
                i = forward (nums,i);
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

    public static int bSearch (int[] nums, long target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if ((long) nums[mid] == target) {
                return mid;
            } else if ((long) nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(fourSum(new int[] {1,0,-1,0,-2,2},0));
        System.out.println(fourSum(new int[] {2,2,2,2,2},8));
        System.out.println(fourSum(new int[] {1000000000,1000000000,1000000000,1000000000},-294967296));
        System.out.println(fourSum(new int[] {-4,-3,-2,-1,0,0,1,2,3,4},0));
        System.out.println(fourSum(new int[] {0,0,4,-2,-3,-2,-2,-3},-1));
    }
}
