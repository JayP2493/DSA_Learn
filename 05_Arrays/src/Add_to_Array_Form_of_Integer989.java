import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Add_to_Array_Form_of_Integer989 {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[] {1,2,0,0}, 36));
        System.out.println(addToArrayForm(new int[] {2,7,4}, 181));
        System.out.println(addToArrayForm(new int[] {2,1,5}, 806));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ansArr = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            int sum = num[num.length-1-i]+k;
            ansArr.add(sum%10);
            k = sum/10;
        }

        while (k > 0) {
            ansArr.add(k%10);
            k = k/10;
        }

        Collections.reverse(ansArr);
        return ansArr;
    }
}
