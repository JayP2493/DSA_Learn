/**
 * @param {number[]} nums
 * @return {number}
 */
const findDuplicate = function(nums) {
    let slow = nums[0];
    let fast = nums[0];

    slow = nums[slow];
    fast = nums[nums[fast]];

    while (slow !== fast) {
        slow = nums[slow];
        fast = nums[nums[fast]];
    }

    slow = nums[0];

    while (slow !== fast) {
        slow = nums[slow];
        fast = nums[fast];
    }

    return fast;
};

const findDuplicate2 = function(nums) {
    let start = 0;
    let end = nums.length-1;

    while (start < end) {
        let mid = Math.floor(start + (end-start)/2)

        let count = 0;

        for (let x of nums) {
            if (mid >= x) {
                count ++;
            }
        }

        if (count > mid) {
            end = mid;
        } else {
            start = mid + 1;
        }
    }

    return start;
}