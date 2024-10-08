/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    k %= nums.length;
    reverse (0,nums.length-1,nums);
    reverse (0,k-1,nums);
    reverse (k,nums.length-1,nums);
};

function reverse (start,end,nums) {
    while (start < end) {
        [nums[start],nums[end]] = [nums[end],nums[start]];
        start++;
        end--;
    }
}