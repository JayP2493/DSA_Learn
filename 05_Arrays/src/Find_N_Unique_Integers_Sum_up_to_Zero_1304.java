import java.util.Arrays;

public class Find_N_Unique_Integers_Sum_up_to_Zero_1304 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
        System.out.println(Arrays.toString(sumZero(3)));
        System.out.println(Arrays.toString(sumZero(0)));
    }

    public static int[] sumZero(int n) {
        if (n == 0) {
            return new int[] {0};
        } else {
            int start = 0;
            int end = n-1;

            int[] temp = new int[n];

            while (start < end) {
                temp[start] = (start+1) * (-1);
                temp[end] = (start+1);
                start++;
                end--;
            }
            return temp;
        }
    }
}
