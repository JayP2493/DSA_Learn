import java.util.Arrays;

public class Frequency_Of_The_Most_Frequent_Element_1838 {
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

    }

    public static void main(String[] args) {
        System.out.println(maxFrequency(new int[] {1,2,4}, 5) == 3);
        System.out.println(maxFrequency(new int[] {1,4,8,13},5) == 2);
        System.out.println(maxFrequency(new int[] {3,9,6},2) == 1);
    }
}
