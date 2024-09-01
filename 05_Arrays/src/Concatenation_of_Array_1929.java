import java.util.Arrays;

public class Concatenation_of_Array_1929 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(conArr(new int[] {1,2,1})));
        System.out.println(Arrays.toString(conArr(new int[] {1,3,2,1})));
    }
    public static int[] conArr(int[] arr) {
        int[] ansArr = new int[(arr.length*2)];

        for (int i = 0; i < arr.length; i++) {
            ansArr[i] = arr[i];
            int j = i+arr.length;
            ansArr[j] = arr[i];
        }

        return ansArr;
    }
}
