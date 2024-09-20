public class Search_in_InfiniteArray {
    public static long firstOne() {
        // Write your code here.
        long start = 0;
        long end = 1;

        while (true) {
            if (get(end) == 0) {
                start = end;
                end *= 2;
            } else {
                return binary(start,end);
            }
        }
    }

    public static long binary (long start, long end) {
        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (get(mid) == 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    public static int get (long num) {
        int[] arr = new int[] {0,0,0,0,0,0,0,1,1,1,1};
        return  arr[(int)num];
    }
}
