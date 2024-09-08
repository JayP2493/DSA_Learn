/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let ans = [];
    ans.push(1);
    let rp = 1;

    for(let i = 1; i < nums.length; i++) {
        ans.push(ans[ans.length-1]*nums[i-1]);
    }

    for(let i = 0; i < nums.length; i++) {
        ans[ans.length-1-i] *= rp
        rp *= nums[nums.length-1-i];
    }

    return ans;
};