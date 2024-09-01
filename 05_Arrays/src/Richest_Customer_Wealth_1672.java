import java.util.Arrays;

public class Richest_Customer_Wealth_1672 {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][] {{1,2,3},{3,2,1}}));
        System.out.println(maximumWealth(new int[][] {{1,5},{7,3},{3,5}}));
    }
    public static int maximumWealth (int[][] accounts) {
        int maxSum = 0;

        for (int[] account : accounts) {
            int sum = 0;

            for (int amount : account) {
                sum += amount;
            }
            maxSum = Math.max(sum,maxSum);
        }

        return maxSum;
    }
}
