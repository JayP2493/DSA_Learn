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
                return new int[] {i,temp};
            }

        }

        return new int[] {-1,-1};
    }

    public static int search (int start, int end, int i, int[] arr, int target) {
        while (start <= end) {

            int mid = start + ((end-start)/2);

            if ((arr[mid]+i) == target) {
                return arr[mid];
            } else if ((arr[mid]+i) >= target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
