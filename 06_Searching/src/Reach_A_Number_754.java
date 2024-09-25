public class Reach_A_Number_754 {
    public int reachNumber(int target) {
        long target2 = (long) Math.abs(target);
        long start = 0;
        long end = target2;

        long lastStep = 1;
        long lastSum = 0;

        while (start <= end) {

            long mid =  start + ((end-start)/2);
            long cSum = ((mid*(mid+1))/2);

            if (cSum == target) {
                return (int) mid;
            } else if (cSum >= target) {
                lastStep = mid;
                lastSum = cSum;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        long diff = lastSum - target;

        if (diff%2 != 0) {
            if ((lastStep+1)%2 == 0) {
                lastStep += 1;
            } else {
                lastStep += 2;
            }
        }

        return (int) lastStep;
    }
}
