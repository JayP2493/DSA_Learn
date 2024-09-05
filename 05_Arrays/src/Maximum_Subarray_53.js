/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let maxSum = Number.MIN_SAFE_INTEGER;
    let cSum = 0;

    for (let i = 0; i < nums.length; i++) {
        cSum += nums[i];

        if (cSum > maxSum) {
            maxSum = cSum;
        }

        if (cSum < 0) {
            cSum = 0;
        }
    }

    return maxSum;
};

console.log(maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))