import java.util.Arrays;

public class Two_Sum_II_Input_Array_Is_Sorted_167 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,4},6)));
        System.out.println(Arrays.toString(twoSum(new int[]{-1,0},-1)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 2) {
            return new int[] {1,2};
        }

        for (int i = 0; i < numbers.length; i++) {
            int temp = search(i+1,numbers.length-1,i,numbers,target);

            if (temp < 0) {
                continue;
            } else {
                return new int[] {i+1,temp+1};
            }

        }

        return new int[] {-1,-1};
    }

    public static int search (int start, int end, int i, int[] arr, int target) {
        while (start <= end) {

            int mid = start + ((end-start)/2);

            if ((arr[mid]+arr[i]) == target) {
                return mid;
            } else if ((arr[mid]+arr[i]) >= target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
    public int[] twoSum_M2(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while (start <= end) {
            if (numbers[start]+numbers[end] == target) {
                return new int[] {start+1, end+1};
            } else if (numbers[start]+numbers[end] > target) {
                end--;
            } else {
                start++;
            }
        }

        return new int[] {-1,-1};
    }
}
