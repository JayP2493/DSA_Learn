import java.util.*;

public class Find_Right_Interval_436 {
    public static int[] findRightInterval_Brute(int[][] intervals) {
        int[] ansArr = new int[intervals.length];

        for(int i = 0; i < intervals.length; i++) {
            int find = Integer.MAX_VALUE;
            int ans = -1;

            for(int j = 0; j < intervals.length; j++) {
                if (intervals[j][0] >= intervals[i][1] && find > intervals[j][0]) {
                    find = intervals[j][0];
                    ans = j;
                }
            }

            ansArr[i] = ans;
        }
        return ansArr;
    }

    public static int[] findRightInterval(int[][] intervals) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[intervals.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < intervals.length; i++) {
            map.put(intervals[i][0],i);
            arr[i] = intervals[i][0];
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

        Arrays.sort(arr);

        int[] ansArr = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            int temp = find (intervals[i][1],arr,min,max);

            if (temp == -1 || map.get(temp) == null) {
                ansArr[i] = -1;
            } else {
                ansArr[i] = map.get(temp);
            }
        }

        return ansArr;
    }

    public static int find (int target, int[] arr, int min, int max) {
        if (target > max) {
            return -1;
        } else {
            int start = 0;
            int end = arr.length-1;

            while (start < end) {
                int mid = start + ((end-start)/2);

                if (arr[mid] == target) {
                    return arr[mid];
                } else if (arr[mid] > target) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }

            return arr[end];
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRightInterval(new int[][] {{3,4},{2,3},{1,2}})));
        System.out.println(Arrays.toString(findRightInterval(new int[][] {{1,4},{2,3},{3,4}})));
    }

}
