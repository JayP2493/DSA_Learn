public class Minimum_Cost_to_Move_Chips_to_The_Same_Position_1217 {
    public static int minCostToMoveChips(int[] position) {
        int[] count = new int[2];

        for (int i = 0; i < position.length; i++) {
            if (position[i]%2 == 0) {
                count[0]++;
            } else {
                count[1]++;
            }
        }

        return Math.min(count[0],count[1]);
    }

    public static void main(String[] args) {
        System.out.println(minCostToMoveChips(new int[] {1,2,3}));
        System.out.println(minCostToMoveChips(new int[] {2,2,2,3,3}));
        System.out.println(minCostToMoveChips(new int[] {1,1000000000}));
    }
}
