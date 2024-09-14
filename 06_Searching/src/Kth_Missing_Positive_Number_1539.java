public class Kth_Missing_Positive_Number_1539 {
    public static int findKthPositive(int[] arr, int k) {
        int start = 1;
        int count = 0;
        int counter = 0;

        while (count < k) {
            int num = 0;
            if (counter == arr.length) {
                num = Integer.MAX_VALUE;
            } else {
                num = arr[counter];
            }

            if (num > start) {
                start++;
                count++;
            } else {
                start++;
                counter++;
            }
        }

        return start-1;
    }

    public static int findKthPositive2(int[] arr, int k) {
        int num = 1;
        int count = 0;

        while (count < arr.length && k > 0) {
            if (arr[count] == num) {
                count++;
            } else {
                k--;
            }
            num++;
        }

        while (k != 0) {
            num++;
            k--;
        }

        return num-1;
    }

    public static int findKthPositive3(int[] arr, int k) {
        if (arr[arr.length-1] == arr.length) {
            return arr.length+k;
        } else if ((arr[0] - 1) >= k) {
            return k;
        } else {
            int start = 0;
            int end = arr.length-1;
            int min = 0;

            while (start <= end) {

                int mid = start + (end-start)/2;
                int actualComponent = mid+1;

                if ((arr[mid]-actualComponent) < k) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

                min = end;
            }

            int diff = k - (arr[min] - (min+1));

            return arr[min] + diff;
        }
    }

    public static int findKthPositive4(int[] arr, int k) {
        int start = 0, end = arr.length-1;

        int mid = -1;

        while (start <= end) {

            mid = start + (end-start)/2;
            int missing_Number = arr[mid] - (mid+1);

            if (missing_Number < k) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }

        return start + k;
    }

    public static void main(String[] args) {

        int[][] val1 = {{2,3,4,7,11},{1,2,3,4},{2},{1,10,21,22,25}};
        int[] val2 = {5,2,1,12};
        Object[] val3 = {};

        for (int i = 0; i < val1.length; i++) {
            System.out.println(findKthPositive(val1[i],val2[i]));
//            System.out.println("Printed formula" + 1 + "-" + (i+1));
        }
        System.out.println("1 Done");
        for (int i = 0; i < val1.length; i++) {
            System.out.println(findKthPositive2(val1[i],val2[i]));
//            System.out.println("Printed formula" + 1 + "-" + (i+1));
        }
        System.out.println("2 Done");
        for (int i = 0; i < val1.length; i++) {
            System.out.println(findKthPositive3(val1[i],val2[i]));
//            System.out.println("Printed formula" + 1 + "-" + (i+1));
        }
        System.out.println("3 Done");
        for (int i = 0; i < val1.length; i++) {
            System.out.println(findKthPositive4(val1[i],val2[i]));
//            System.out.println("Printed formula" + 1 + "-" + (i+1));
        }
        System.out.println("4 Done");
    }

}
