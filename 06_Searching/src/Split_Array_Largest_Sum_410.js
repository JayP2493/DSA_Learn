/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var splitArray = function(nums, k) {
    let start = 0;
    let end = 0;

    for (let num of nums) {
        start = Math.max(start,num);
        end += num;
    }

    while (start < end) {
        let mid = Math.floor(start + (end-start)/2);

        if (counter(nums,mid,k)) {
            end = mid;
        } else {
            start = mid + 1;
        }
    }

    return start;
};

function counter (arr, maxSum, k) {
    let cSum = 0;
    let ans = 1;

    for (let num of arr) {
        cSum += num;

        if (cSum > maxSum) {
            ans++;
            if (ans > k) {
                return false;
            }
            cSum = num
        }
    }

    return true;
}

