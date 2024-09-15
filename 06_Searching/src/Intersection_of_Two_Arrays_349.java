import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_of_Two_Arrays_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersection (nums2,nums1);
        }

        Arrays.sort(nums1);
        int[] arr1 = new int[1010];
        List<Integer> ans = new ArrayList();

        for(int i = 0; i < nums2.length; i++) {
            if (arr1[nums2[i]] > 0) {
                continue;
            } else {
                arr1[nums2[i]]++;
                if (find(nums1,nums2[i])) {
                    ans.add(nums2[i]);
                } else {
                    continue;
                }
            }
        }

        int[] ansArr = new int[ans.size()];

        for(int i = 0; i < ans.size(); i++) {
            ansArr[i] = ans.get(i);
        }

        return ansArr;
    }

    public static boolean find(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while ( start <= end ) {
            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[] {1,2,2,1}, new int[] {2,2})));
        System.out.println(Arrays.toString(intersection(new int[] {4,9,5}, new int[] {9,4,9,8,4})));
    }
}
