public class Arranging_Coins_441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
    }
    public static int arrangeCoins(int n) {
        int start = 0;
        int end = n;

        while (start <= end) {

            int mid = start + (end-start)/2;
            long sum = ((long)mid*(mid+1))/2;

            if (sum == (long) n) {
                return (int) mid;
            } else if ((long)n < sum) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }
}
