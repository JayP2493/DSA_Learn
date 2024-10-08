import java.io.FilterOutputStream;
import java.util.Arrays;

public class Median_Of_Two_Sorted_Arrays_4 {
    public static double findMedianSortedArrays_BruteForce1(int[] nums1, int[] nums2) {
        int[] ansArr = new int[nums1.length + nums2.length];
        int index = 0;

        for(int x : nums1) {
            ansArr[index++] = x;
        }

        for(int x : nums2) {
            ansArr[index++] = x;
        }

        Arrays.sort(ansArr);

        if (ansArr.length%2 == 0) {
            int mid = (ansArr.length-1)/2;
            return ((double) ansArr[mid] + (double) ansArr[mid+1])/2;
        } else {
            return (double) ansArr[(ansArr.length-1)/2];
        }
    }

    public static double findMedianSortedArrays_BruteForce2 (int[] nums1, int[] nums2) {
        int[] ansArr = new int[nums1.length + nums2.length];
        int index = 0;
        int i = 0;
        int j = 0;


        while (index < ansArr.length && i < nums1.length && j < nums2.length) {
            if (nums1[i] >= nums2[j]) {
                ansArr[index] = nums2[j];
                index++;
                j++;
            } else {
                ansArr[index] = nums1[i];
                index++;
                i++;
            }
        }

        while (i < nums1.length) {
            ansArr[index] = nums1[i];
            index++;
            i++;
        }

        while (j < nums2.length) {
            ansArr[index] = nums2[j];
            index++;
            j++;
        }

        if (ansArr.length%2 == 0) {
            int mid = (ansArr.length-1)/2;
            return ((double) ansArr[mid] + (double) ansArr[mid+1])/2;
        } else {
            return (double) ansArr[(ansArr.length-1)/2];
        }
    }

    public static double findMedianSortedArrays_Better (int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int size = m+n;

        int idx1 = (size/2)-1;
        int element1 = -1;

        int idx2 = (size/2);
        int element2 = -1;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n && k <= idx2) {
            if (nums1[i] < nums2[j]) {
                if (k == idx1) {
                    element1 = nums1[i];
                }
                if (k == idx2) {
                    element2 = nums1[i];
                }
                i++;
                k++;
            } else {
                if (k == idx1) {
                    element1 = nums2[j];
                }
                if (k == idx2) {
                    element2 = nums2[j];
                }
                j++;
                k++;
            }
        }

        while (i < m && k <= idx2) {
            if (k == idx1) {
                element1 = nums1[i];
            }
            if (k == idx2) {
                element2 = nums1[i];
            }
            i++;
            k++;
        }

        while (j < n && k <= idx2) {
            if (k == idx1) {
                element1 = nums2[j];
            }
            if (k == idx2) {
                element2 = nums2[j];
            }
            j++;
            k++;
        }

        if (size%2 == 0) {
            return ((double) element1 + (double) element2)/2;
        } else {
            return (double) element2;
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2,nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int ansLength = m+n;
        int leftLength = (ansLength+1) / 2;


        int start = 0;
        int end = nums1.length;

        while (start <= end) {
            int mid = start + (end - start)/2;
            int mid2 = leftLength - mid;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;

            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if (mid < m) {
                r1 = nums1[mid];
            }

            if (mid2 < n) {
                r2 = nums2[mid2];
            }

            if (mid - 1 >= 0) {
                l1 = nums1[mid-1];
            }

            if (mid2 - 1 >= 0) {
                l2 = nums2[mid2-1];
            }

            if (l1 <= r2 && l2 <= r1) {
                if (ansLength%2 == 1) {
                    return (double) Math.max(l1,l2);
                } else {
                    return ((double) (Math.max(l1,l2) + Math.min(r1,r2)))/2;
                }
            } else if (l1 > l2) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return 0;
    }



    public static void run (int[] nums1, int[] nums2) {
        System.out.println(findMedianSortedArrays_BruteForce1(nums1,nums2));
        System.out.println(findMedianSortedArrays_BruteForce2(nums1,nums2));
        System.out.println(findMedianSortedArrays_Better(nums1,nums2));
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static void main(String[] args) {
        run(new int[] {1,3}, new int[] {2});
        run(new int[] {1,2}, new int[] {3,4});
        run(new int[] {3,4}, new int[] {});
    }
}
