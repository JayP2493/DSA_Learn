public class Guess_Number_Higher_or_Lower_374 {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) /2;

            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }

    // temp delete when you run
    public int guess(int mid) {
        return 0;
    }
}
