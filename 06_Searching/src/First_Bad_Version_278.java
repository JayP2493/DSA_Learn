public class First_Bad_Version_278 {
    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {

            int mid = start + ((end - start) / 2);

            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static boolean isBadVersion (int n) {
        int x = 4;
        return (x <= n);
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}
