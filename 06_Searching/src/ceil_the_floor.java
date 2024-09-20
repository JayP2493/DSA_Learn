import java.util.Arrays;

public class ceil_the_floor {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Wriute your code here.
        int start = 0;
        int end = a.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (a[mid] == x) {
                return new int[] {x,x};
            } else if (a[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        if (end < 0 || end >= a.length) {
            return new int[] {-1,a[start]};
        } else if (start < 0 || start >= a.length) {
            return new int[] {a[end],-1};
        } else {
            return new int[] {a[end],a[start]};
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ceil_the_floor.getFloorAndCeil(new int[] {2},1,23)));
        System.out.println(Arrays.toString(ceil_the_floor.getFloorAndCeil(new int[] {5,7,7,12,22,28,29},7,30)));
    }
}
