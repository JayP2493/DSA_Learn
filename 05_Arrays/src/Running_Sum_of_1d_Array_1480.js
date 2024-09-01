/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    sums(nums,0,0);
    return nums;
};

function sums (nums,sum,i) {
    if (i < nums.length) {
        let ans = sum + nums[i];
        sums(nums,ans,i+1);
        nums[i] = ans;
    }
}