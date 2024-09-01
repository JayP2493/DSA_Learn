import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies_1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ansArray = new ArrayList<>();
        int max = 0;

        for (int candie : candies) {
            max = Math.max(candie,max);
        }

        for (int candie : candies) {
            ansArray.add(max <= candie+extraCandies);
        }

        return ansArray;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[] {2,3,5,1,3},3));
        System.out.println(kidsWithCandies(new int[] {4,2,1,1,2},1));
        System.out.println(kidsWithCandies(new int[] {12,1,12},10));
    }
}
