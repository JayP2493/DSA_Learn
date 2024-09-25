public class Capacity_To_Ship_Packages_Within_D_Days_1011 {
    public static int shipWithinDays(int[] weights, int days) {
        int start = weights[0];
        int end = 0;

        for (int wei : weights) {
            start = Math.max(wei,start);
            end += wei;
        }

        while (start < end) {
            int mid = start + (end - start) /2;

            if (find(weights,mid,days)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }

    public static boolean find (int[] arr, int mid, int target) {
        int days = 0;
        int cSum = 0;

        for (int wei : arr) {
            if (cSum+wei > mid) {
                cSum = wei;
                days++;
            } else {
                cSum += wei;
            }
        }

        return days < target;
    }

    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[] {1,2,3,4,5,6,7,8,9,10},5));
    }
}
