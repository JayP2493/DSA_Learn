/**
 * @param {number[]} nums
 * @return {number[]}
 */
var smallerNumbersThanCurrent = function(nums) {
    let ans = [];

    for (let i = 0; i < nums.length; i++) {
        let a = 0;

        for(let j = 0; j < nums.length; j++) {
            if (nums[i] > nums[j]) {
                a++;
            }
        }

        ans[i] = a;
    }

    return ans;
};