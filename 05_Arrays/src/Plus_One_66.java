import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plus_One_66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] {1,2,3,9})));
        System.out.println(Arrays.toString(plusOne(new int[] {9,9,9,9})));
        System.out.println(Arrays.toString(plusOne(new int[] {1,2,3})));
        System.out.println(Arrays.toString(plusOne(new int[] {4,3,2,2})));
        System.out.println(Arrays.toString(plusOne(new int[] {9})));
    }
    public static int[] plusOne(int[] digits) {
        List<Integer> temp = new ArrayList<>();
        if (digits[digits.length-1] == 9) {
            int k = 1;

            for (int i = 0; i < digits.length; i++) {
                int sum = digits[digits.length-1-i] + k;
                temp.add(sum%10);
                k = sum/10;
            }

            if (k == 1) {
                temp.add(1);
            }
        } else {
            digits[digits.length-1]++;
            return digits;
        }
        int[] ansArr = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            ansArr[i] = temp.get(temp.size()-1-i);
        }

        return ansArr;

    }
}
