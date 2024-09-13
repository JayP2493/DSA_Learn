public class Sqrt_69 {
    public static int mySqrt(int x) {
        int start = 0;
        int end = x;

        while (start <= end) {
            int mid = start  + ((end - start)/2);

            if (((long)mid*mid) == (long) x) {
                return mid;
            } else if (((long)mid*mid) < (long) x) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return end;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(2147395599));
    }
}
