import java.util.Arrays;

public class Sort_Colors_75 {
    public static void main(String[] args) {
        print (new int[] {2,0,2,1,1,0});
        print (new int[] {2,0,1});
    }
    public static void print (int[] nums) {
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int a = 0;
        int b = nums.length-1;
        int s = 0;

        while (s <= b) {
            if (nums[s] == 0) {
                swap(s,a,nums);
                a++;
                s++;
            } else if (nums[s] == 2) {
                swap(s,b,nums);
                b--;
            } else {
                s++;
            }
        }
    }

    public static void swap (int a,int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void sortColors2(int[] nums) {
        int[] temp = Arrays.copyOf(nums,nums.length);
        int start = 0;
        int end = nums.length-1;

        for (int i = 0; i < nums.length; i++) {
            if (temp[i] == 0) {
                nums[start] = temp[i];
                start++;
            } else if (temp[i] == 2) {
                nums[end] = temp[i];
                end--;
            }
        }

        while (start <= end) {
            nums[start] = 1;
            start++;
        }
    }

}
