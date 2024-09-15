import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_of_Two_Arrays_II_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            intersect (nums2,nums1);
        }

        int[] mapping = new int[1001];

        for (int num : nums2) {
            mapping[num]++;
        }

        List<Integer> aL = new ArrayList();

        for(int num: nums1) {
            if (mapping[num] > 0) {
                mapping[num]--;
                aL.add(num);
            }
        }

        int[] ans = new int[aL.size()];

        for (int i = 0; i < aL.size(); i++) {
            ans[i] = aL.get(i);
        }

        return ans;
    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> arr = new ArrayList();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] ans = new int[arr.size()];

        for (int k = 0; k < ans.length; k++) {
            ans[k] = arr.get(k);
        }

        return ans;
    }
}
