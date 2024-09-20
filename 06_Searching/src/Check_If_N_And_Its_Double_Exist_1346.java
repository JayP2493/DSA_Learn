import java.util.Arrays;

public class Check_If_N_And_Its_Double_Exist_1346 {
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int zero = 0;

        for (int i = 0; i < arr.length-1; i++) {
            int start = 0;
            int end = arr.length-1;
            if (arr[i] == 0) {
                zero++;
                continue;
            }

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if ((arr[i]*2) == arr[mid]) {
                    return true;
                } else if ((arr[i]*2) > arr [mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return zero >= 2;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[] {-10,12,-20,-8,15}));
        System.out.println(checkIfExist(new int[] {0,0}));
    }
}
