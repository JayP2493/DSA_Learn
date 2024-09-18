public class Single_Element_In_A_Sorted_Array_540 {
    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end -start) / 2;

            if (((mid%2) == 0 && nums[mid] == nums[mid+1]) || ((mid%2) == 1 && nums[mid] == nums[mid-1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return nums[start];
    }

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
        System.out.println(singleNonDuplicate(new int[] {3,3,7,7,10,11,11}));
        System.out.println(singleNonDuplicate(new int[] {2,3,3,7,7,11,11}));
    }
}
