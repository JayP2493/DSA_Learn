public class Maximum_Population_Year_1854 {
    public static void main(String[] args) {
        System.out.println(maximumPopulation(new int[][]{{1993,1999},{2000,2010}}));
        System.out.println(maximumPopulation(new int[][]{{1950,1961},{1960,1971},{1970,1981}}));
    }
    public static int maximumPopulation(int[][] logs) {
        int[] arr = new int[2052];

        for (int[] log : logs) {
            arr[log[0]]++;
            arr[log[1]]--;
        }

        int[] maxNumber = new int[2];
        maxNumber[0] = arr[1950];
        maxNumber[1] = 1950;

        for (int i = 1950; i < arr.length; i++) {
            arr[i] += arr[i-1];

            if (maxNumber[0] < arr[i]) {
                maxNumber[0] = arr[i];
                maxNumber[1] = i;
            }
        }

        return maxNumber[1];
    }

}
