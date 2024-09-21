public class Split_Array_Largest_Sum_410 {
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start,num);
            end += num;
        }

        while (start < end) {
            int mid = start + (end-start)/2;

            if (counter(nums,mid,k)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static boolean counter (int[] arr, int maxCount, int maxAns) {
        int cCount = 0;
        int ans = 1;

        for (int num : arr) {
            cCount += num;

            if (cCount > maxCount) {
                ans++;
                if (ans > maxAns) {
                    return false;
                }
                cCount = num;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(splitArray(new int[] {7,2,5,10,8},2));
    }
}
