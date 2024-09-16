import java.util.Arrays;

class Fair_Candy_Swap_888 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(bobSizes);

        int sumAlice = 0, sumBob = 0;

        for (int sum : aliceSizes) {
            sumAlice += sum;
        }
        for (int sum : bobSizes) {
            sumBob += sum;
        }

        // Corrected: difference between Bob and Alice's sums, no abs
        int diff = (sumBob - sumAlice) / 2;

        int[] ans = new int[2];

        for (int i = 0; i < aliceSizes.length; i++) {
            int start = 0;
            int end = bobSizes.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                // Corrected: check aliceSizes[i] + diff
                if (bobSizes[mid] == aliceSizes[i] + diff) {
                    ans[0] = aliceSizes[i];
                    ans[1] = bobSizes[mid];
                    return ans;
                } else if (bobSizes[mid] > aliceSizes[i] + diff) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}

