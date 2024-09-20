public class Find_In_Mountain_Array_1095 {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        if (target == mountainArr.get(start)) {
            return start;
        }

        int ans1 = search(target, mountainArr, true, 0, end);
        if (ans1 >= 0) {
            return ans1;
        } else {
            return search(target, mountainArr, false, end, mountainArr.length() - 1);
        }
    }

    public int search(int target, MountainArray mountainArr, boolean dir, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            } else if (mountainArr.get(mid) > target) {
                if (dir) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (!dir) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
