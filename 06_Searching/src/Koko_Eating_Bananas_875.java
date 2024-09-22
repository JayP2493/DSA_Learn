public class Koko_Eating_Bananas_875 {
    public static int minEatingSpeed(int[] piles, int h) {

        long start = piles[0];
        long end = 0;

        for (int i = 0; i < piles.length; i++) {
            start = Math.min(piles[i],start);
            end += piles[i];
        }

        long ans = 0;

        while (start <= end) {
            long mid = start + (end-start) / 2;
            long hours = speedCounter (mid,piles);

            if (hours < h) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (int)ans;
    }

    public static long speedCounter (long speed, int[] arr) {
        long ans = 0;

        for (int num : arr) {
            ans += (long) num/speed;
            if (num%speed != 0) {
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[] {3,6,7,11},8));
        System.out.println(minEatingSpeed(new int[] {30,11,23,4,20},5));
        System.out.println(minEatingSpeed(new int[] {30,11,23,4,20},6));
        System.out.println(minEatingSpeed(new int[] {312884470},312884469));
    }
}
