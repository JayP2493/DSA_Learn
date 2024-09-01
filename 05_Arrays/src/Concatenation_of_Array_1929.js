/**
 * @param {number[]} nums
 * @return {number[]}
 */
const getConcatenation = function(nums) {
    let ans = [];
    for(let i = 0; i < nums.length; i++) {
        ans[i] = nums[i];
        ans[i+nums.length] = nums[i];
    }
    return ans;
};