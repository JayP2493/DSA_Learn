public class Find_Numbers_with_Even_Number_of_Digits_1295 {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[] {12,345,2,6,7896}));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int lengthCount = 0;

            while (temp > 0) {
                lengthCount++;
                temp -= temp%10;
                temp /= 10;
            }

            if (lengthCount%2 == 0) {
                count++;
            }
        }

        return count;
    }
}
