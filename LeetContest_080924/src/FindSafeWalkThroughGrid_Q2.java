import java.util.List;

public class FindSafeWalkThroughGrid_Q2 {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {

        if (grid.get(0).get(0) == 1 && health == 1) {
            return false;
        }

        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};

        int row = 0;
        int col = 0;
        int[] current_Location = {0,0};
        int h = health;

        while (row < grid.size() && col < grid.get(0).size()) {

        }
    }

}
