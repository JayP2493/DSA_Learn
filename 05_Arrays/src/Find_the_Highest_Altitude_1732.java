public class Find_the_Highest_Altitude_1732 {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[] {-5,1,5,0,-7}));
        System.out.println(largestAltitude(new int[] {-4,-3,-2,-1,4,3,2}));
    }
    public static int largestAltitude(int[] gain) {
        int current = 0;
        int maxAltitude = 0;

        for (int val : gain) {
            current += val;
            maxAltitude = Math.max(current,maxAltitude);
        }

        return maxAltitude;
    }
}
